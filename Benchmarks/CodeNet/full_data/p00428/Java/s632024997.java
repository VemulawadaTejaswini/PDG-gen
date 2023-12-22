import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, M;

	public static void main(String[] args) throws Exception {
		while (true) {
			N = sc.nextInt();
			M = sc.nextInt();
			if (N == 0) break;
			sc.nextLine();
			long[] c = new long[M];
			for (int i = 0; i < M; ++i) {
				c[i] = M - i;
			}
			for (int i = 0; i < N; ++i) {
				String line = sc.nextLine();
				for (int j = 0; j < M; ++j) {
					c[j] += ((long) (line.charAt(j * 2) - '0')) << 32;
				}
			}
			Arrays.sort(c);
			for (int i = M - 1; i >= 0; --i) {
				System.out.print(M + 1 - (int) c[i]);
				if (i != 0) System.out.print(' ');
			}
			System.out.println();
		}
	}
}