import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = scan.nextInt();
		int m = scan.nextInt();
		long[] h = new long[n];
		int i;
		for(i = 0; i < n; i++)
			h[i] = scan.nextLong();

		int a,b;
		int[][] ab = new int[n][n];
		for(i = 0; i < m; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			ab[a - 1][b - 1] = 1;
			ab[b - 1][a - 1] = 1;
		}
		int j;
		boolean f;
		long ans = 0;
		for(i = 0; i < n; i++) {
			f = true;
			for(j = 0; j < n; j++) {
				if(i == j)
					continue;
				if(ab[i][j] == 0)
					continue;
				if(h[i] <= h[j]) {
					f = false;
					break;
				}
			}
			if(f)
				ans++;
		}
		out.print(ans);
		out.flush();
	}
}
