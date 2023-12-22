import java.util.*;
import java.awt.Point;

public class Main{
	static int w,h;
	static Point sa,sb,ga,gb;
	static char[][] mapA, mapB;
	static boolean[][][][] memo;

	static int dxa[] = {0,0,1,-1};
	static int dxb[] = {0,0,-1,1};
	static int dya[] = {1,-1,0,0};
	static int dyb[] = {1,-1,0,0};

	static boolean solve(Point posA, Point posB){
		memo[posA.x][posA.y][posB.x][posB.y] = true;

		for(int i=0;i<4;i++){
			Point na = new Point(posA.x+dxa[i], posA.y+dya[i]);
			Point nb = new Point(posB.x+dxb[i], posB.y+dyb[i]);

			if(na.x<0 || na.x>=w || na.y<0 || na.y>=h || mapA[na.y][na.x]=='#') na = new Point(posA.x,posA.y);
			if(nb.x<0 || nb.x>=w || nb.y<0 || nb.y>=h || mapB[nb.y][nb.x]=='#') nb = new Point(posB.x,posB.y);

			if(na.equals(ga) && nb.equals(gb)) return true;
			if(na.equals(ga) || nb.equals(gb)) continue;
			if(memo[na.x][na.y][nb.x][nb.y]) continue;
			if(solve(na,nb)) return true;
		}
		return false;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0) break;

			memo = new boolean[w+1][h+1][w+1][h+1];
			mapA = new char[h][w];
			mapB = new char[h][w];

			for(int i=0;i<h;i++){
				mapA[i] = sc.next().toCharArray();
				mapB[i] = sc.next().toCharArray();
				
				for(int j=0;j<w;j++){
					if(mapA[i][j] == 'L'){
						sa = new Point(j,i);
					}
					else if(mapA[i][j] == '%'){
						ga = new Point(j,i);
					}
					if(mapB[i][j] == 'R'){
						sb = new Point(j,i);
					}
					else if(mapB[i][j] == '%'){
						gb = new Point(j,i);
					}
				}
			}

			System.out.println(solve(sa,sb) ? "Yes" : "No");
		}
	}
}