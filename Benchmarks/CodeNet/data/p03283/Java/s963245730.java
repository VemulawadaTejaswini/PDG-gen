import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int Q = sc.nextInt();

		int[][] dp = new int[N+1][N+1];


		for(int i=0;i<M;i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();

			for(int x=1;x<=l;x++) {
				for(int y=r;y<=N;y++) {
					dp[x][y] ++;
				}
			}
		}

		for(int i=0;i<Q;i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();

			out.println(dp[p][q]);
		}

		sc.close();


	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
