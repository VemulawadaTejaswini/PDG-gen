import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int[][] x = new int[n][d];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < d; j++) {
				x[i][j] = sc.nextInt();
			}
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int tmp = 0;
				for (int k = 0; k < d; k++) {
					tmp += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
				}
				
				int sqrt = (int)Math.sqrt(tmp);
				if (sqrt * sqrt == tmp) {
					ans++;
				}
			}
		}
		
		pr.println(ans);
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);
			
		solve();
			
		pr.close();
		sc.close();
	}

	static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
