import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int[][] m = new int[h + 2][w+ 2];
		int[][] fin = new int[h + 2][w + 2];
		int[] x = new int[h * w + 1];
		int[] y = new int[h * w + 1];
		for(int i = 0; i < h + 2; i++) {
			for(int j = 0; j < w + 2; j++) {
				m[i][j] = 100000000;
				fin[i][j] = 0;
			}
		}
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				m[i + 1][j + 1] = sc.nextInt();
			}
		}
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j <= w; j++) {
				x[m[i][j]] = i;
				y[m[i][j]] = j;
			}
		}
		
		int ans = 0;
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		for(int k = 1; k <= h * w; k++) {
			int r = 0;
			for(int v = 0; v < 4; v++) {
				int nx = x[k] + dx[v];
				int ny = y[k] + dy[v];
				
				if(nx >= 0 && nx <= h && ny >= 0 && ny <= w && m[nx][ny] < k) {
					if(r == 0) {
						r = fin[nx][ny];
					}else if(r != fin[nx][ny]) {
						r = -1;
					}
					
				}
			}
			
			if(r == 0) {
				fin[x[k]][y[k]] = k;
			}else {
				fin[x[k]][y[k]] = r;
			}
			
			if(r == -1) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}
