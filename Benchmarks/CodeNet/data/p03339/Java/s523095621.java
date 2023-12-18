import java.util.Scanner;

public class Main {
	private static final char L = 'W';

	public static void main(String args[]) {
		try (Scanner in = new Scanner(System.in)) {
			int N = Integer.parseInt(in.nextLine());
			String S = in.nextLine();

			int[] countToR = new int[N];
			for (int i = 0; i < N; i++) {
				if (i == 0) {
					if (S.charAt(i) == L) {
						countToR[i] = 1;
					} else {
						countToR[i] = 0;
					}
					continue;
				}
				if (S.charAt(i) == L) {
					countToR[i] = 1 + countToR[i - 1];
				} else {
					countToR[i] = 0 + countToR[i - 1];
				}
			}
			int[] countToL = new int[N];
			for (int i = N - 1; i >= 0; i--) {
				if (i == N - 1) {
					if (S.charAt(i) == L) {
						countToL[i] = 0;
					} else {
						countToL[i] = 1;
					}
					continue;
				}
				if (S.charAt(i) == L) {
					countToL[i] = 0 + countToL[i - 1];
				} else {
					countToL[i] = 1 + countToL[i - 1];
				}
			}

			int min = (int) 1e9;
			for (int i = 0; i < N; i++) {
				int il = i - 1;
				int ir = i + 1;
				int count = (ir < N ? countToL[ir] : 0) + (il >= 0 ? countToR[il] : 0);

				min = Math.min(min, count);

			}

			System.out.println(min);
		}
	}
}
