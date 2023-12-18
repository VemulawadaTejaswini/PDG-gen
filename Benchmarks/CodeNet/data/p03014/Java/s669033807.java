import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		int H = nextInt();
		int W = nextInt();

		boolean[][] map = new boolean[H+1][W+1];//false:障害物

		for(int i=0;i<H;i++) {
			char[]C = next().toCharArray();
			for(int j=0;j<W;j++) {
				map[i][j]=C[j]=='.'?true:false;
			}
		}
		sc.close();

		int[][] dp = new int [H][W];

		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				int tj = j;
				int cnt = 0;
				while(map[i][j]&&j<W) {
					cnt++;
					j++;
				}
				Arrays.fill(dp[i],tj,j,+cnt);
			}
		}
		int Max = 0;
		for(int j=0;j<W;j++) {
			for(int i=0;i<H;i++) {
				int ti = i;
				int cnt = 0;
				while(map[i][j]&&i<H) {
					cnt++;
					i++;
				}
				while(map[ti][j]&&ti<H) {
					dp[ti][j]+=cnt;
					Max = max(Max,dp[ti][j]);
					ti++;
				}
			}
		}

		out.println(Max-1);
	}

	private int max(int a, int b) {
		return Math.max(a, b);
	}

	private static int nextInt() {
		return Integer.parseInt(next());
	}
	private static long nextLong() {
		return Long.parseLong(next());
	}
	private static String next() {
		return sc.next();
	}

}