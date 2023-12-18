import java.util.*;
public class Main{
	static int h;
	static int w;
	static char[][] c = new char[402][402];
	static boolean[][] visited = new boolean[402][402];
	static int[][] dxy = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
	static int[][] ans = new int[402][402];
	static int[][][] black = new int[402][402][2];
	static void rec(int sx, int sy, int x, int y){
		if(c[x][y]=='.'){
			ans[sx][sy]++;
		}
		if((c[x][y]=='.' && c[x+1][y]!='#' && c[x-1][y]!='#' &&c[x][y+1]!='#' &&c[x][y-1]!='#') || (c[x][y]=='#' && c[x+1][y]!='.' && c[x-1][y]!='.' &&c[x][y+1]!='.' &&c[x][y-1]!='.')){
			return;
		}
		visited[x][y] = true;
		for(int i=0; i<4; i++){
			int x2 = x + dxy[i][0];
			int y2 = y + dxy[i][1];
			if((c[x][y]=='.' && c[x2][y2]=='#')){
				if(visited[x2][y2]==false){
					rec(sx, sy, x2, y2);
				}
			}
			if((c[x][y]=='#' && c[x2][y2]=='.')){
				if(visited[x2][y2]==false){
					black[x2][y2][0] = sx;
					black[x2][y2][1] = sy;
					rec(sx, sy, x2, y2);
				}
			}
		}
	}
		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		for(int i=1; i<h+1; i++){
			String s = sc.next();
			for(int j=1; j<w+1; j++){
				c[i][j] = s.charAt(j-1);
			}
		}
		int num = 0;
		for(int i=1; i<h+1; i++){
			for(int j=1; j<w+1; j++){
				if(c[i][j]=='#'){
					if(black[i][j][0]!=0){
						ans[i][j] = ans[black[i][j][0]][black[i][j][1]];
					}
					else{
						for(int k=1; k<h+1; k++){
							Arrays.fill(visited[k], false);
						}
						rec(i, j, i, j);
					}
					num += ans[i][j];
				}
			}
		}
		System.out.println(num);
	}
}