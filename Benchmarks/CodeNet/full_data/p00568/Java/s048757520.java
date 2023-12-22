import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();

		int W = sc.nextInt();

		int[][] tree = new int[H][W];

		long[][] dp = new long[H][W];

		int[][] rec = new int[H][W];

		//格納
		for(int i=0;i<H;i++) {

			for(int j=0;j<W;j++) {

				tree[i][j] = sc.nextInt();

				dp[i][j] = Long.MAX_VALUE;

				rec[i][j] = -1;

			}
		}

		dp[0][0] = 0;

		dp[0][1] = tree[0][1];

		dp[1][0] = tree[1][0];

		rec[0][0] = 0;

		rec[0][1] = 0;

		rec[1][0] = 0;

		int count = 6;

		while(count>0) {

			//int a = dp[H-1][W-1];

			for(int i=0;i<H;i++) {

				for(int j=0;j<W;j++) {

					if(!(i==0&&j==0) && !(i==0&&j==1) && !(i==1&&j==0)) {

						solve(dp,tree,rec,H,W,i,j);
					}
				}
			}

			count--;

		}
		System.out.println(dp[H-1][W-1]);

	}

	static void solve(long[][] dp,int[][] tree, int[][] rec,int H, int W, int x, int y) {

		int[] dx = {1,0,-1,0};

		int[] dy = {0,1,0,-1};

		boolean flag = false;

		int xx = 0;

		int yy = 0;

		long z = dp[x][y];

		//移動4方向をループ
		for(int i=0;i<4;i++) {

			int nx = x + dx[i];

			int ny = y + dy[i];

			//移動可能かどうか
			if(nx>=0 && nx<H && ny>=0 && ny<W) {

				//最小をさがす
				if(dp[nx][ny]<z && dp[nx][ny]!=Long.MAX_VALUE) {

					z = dp[nx][ny];

					flag = true;

					xx = nx;

					yy = ny;
				}
			}
			if(flag) rec[x][y] = rec[xx][yy] + 1;

			flag = false;

			if(dp[x][y]>z + ((rec[x][y])*2+1)*tree[x][y]) {

				dp[x][y] = z + ((rec[x][y])*2+1)*tree[x][y];

			}
		}
	}
}

