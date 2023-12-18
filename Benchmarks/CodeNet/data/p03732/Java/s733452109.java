import java.io.PrintStream;
import java.util.Scanner;
 public class Main {
	private static final PrintStream so = System.out;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] w = new int[N + 1];
		int[] v = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		
		long[][] sumV = new long[N + 1][W + 1];

		long max = 0;
		for (int iN = 1; iN <= N; iN++) {
			for (int iW = 1; iW <= W; iW++) {
		
				long a = sumV[iN]    [iW - 1];
				long b = sumV[iN - 1][iW];
				long c = (iW - w[iN] >= 0) ? sumV[iN - 1][iW - w[iN]] + v[iN]: 0;
				sumV[iN][iW] = Math.max(a, Math.max(b, c));
				
				max = Math.max(sumV[iN][iW], max);
			}
		}
		so.println(max);
 	}
}
