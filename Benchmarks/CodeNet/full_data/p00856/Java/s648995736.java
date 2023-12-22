
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	Scanner sc;

	void run() {
		for (;;) {
			int n = sc.nextInt();
			int t = sc.nextInt();
			int l = sc.nextInt();
			int b = sc.nextInt();

			if ((n | t | l | b) == 0) {
				break;
			}

			n++;
			// int[] L = new int[l];
			boolean[] L = new boolean[n];
			boolean[] B = new boolean[n];
			for (int i = 0; i < l; i++) {
				L[sc.nextInt()] = true;
			}

			for (int i = 0; i < b; i++) {
				B[sc.nextInt()] = true;
			}

			double dp[][] = new double[n][2]; // 2 -> rest

			double ll = 0;

			dp[0][0] = 1;

			for (int j = 0; j < t; j++) {
				double[][] next = new double[n][2];
				for (int i = 0; i < n; i++) {
					next[i][0] += dp[i][1]; // rest to active
					
					if (i == n - 1) {
						next[n - 1][0] += dp[n - 1][0]; // stay in goal
					} else {
						for (int d = 1; d <= 6; d++) {
							int nd = i + d;
							if (nd > n-1 ) {
								nd = 2 * (n-1) - nd ;
							}

							int k = 0;
							if(L[nd]){
								k = 1;
							}
							if(B[nd]){
								nd =0;
							}
							next[nd][k] += dp[i][0]/6;
						}
					}
				}
				dp = next;
			}
			System.out.printf("%f\n",dp[n-1][0]);
		}
	}

	Main() {
		sc = new Scanner(System.in);
		try {
			sc = new Scanner(new File(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}