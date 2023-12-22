import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();
			if(n == 0 && m == 0 && p == 0)break;
			else calc(n, m, p);
			
		}
	}
	public void calc(int n, int m, int p){
		int[][][] map = new int[n][n][n];
		int col = 1;
		boolean ans = false;
		for(int i = 1; i < p + 1; i++){
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			if(!ans){
				for(int j = 0; j < n; j++){
					if(map[x][y][j] == 0){
						map[x][y][j] = col;
						ans = check(map, x, y, j, n, m, col);
						if(ans){
							if(col == 1) System.out.println("Black "  + i);
							else System.out.println("White " + i);
						}
						col = col * -1;
						break;
					}
				}
			}
		}
		if(!ans) System.out.println("Draw");
	}
	
	public boolean check(int[][][] map, int x, int y, int z, int n, int m, int col){
		ArrayList<int[]> v = new ArrayList<int[]>();
		v.add(new int[]{1,0,0});
		v.add(new int[]{0,1,0});
		v.add(new int[]{0,0,1});
		v.add(new int[]{1,1,0});
		v.add(new int[]{1,0,1});
		v.add(new int[]{0,1,1});
		v.add(new int[]{1,1,1});
		v.add(new int[]{1,-1,0});
		v.add(new int[]{1,0,-1});
		v.add(new int[]{0,1,-1});
		v.add(new int[]{1,1,-1});
		v.add(new int[]{1,-1,1});
		v.add(new int[]{-1,1,1});
		
		for(int count = 0; count < 13; count++){
			int[] ve = v.get(count);
			int c = 0;
			for(int i = -2 * n; i < 2 * n + 1; i++){
				int nX = ve[0]*i + x;
				int nY = ve[1]*i + y;
				int nZ = ve[2]*i + z;
				if(0 <= nX && nX < n && 0 <= nY && nY < n && 0 <= nZ && nZ < n){
					if(map[nX][nY][nZ] == col) {
						c++;
						if(c == m) return true;
					}
					else c = 0;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}