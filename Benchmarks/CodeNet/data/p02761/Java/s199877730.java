import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] s = new int[M+1];
		int[] c = new int[M+1];
		boolean f = true;

		for (int i = 1; i < M+1; i++) {
			s[i] = scan.nextInt();
			c[i] = scan.nextInt();
		}

		if (N == 1) {
			for (int i = 1; i < M; i++) {
				if (c[i] != c[i+1]) {
					f = false;
				}
			}

			if (f && M == 0) System.out.println(0);
			else if (f) System.out.println(c[1]);
			else System.out.println(-1);

		} else {
			int[] ans = new int[N+1];
			boolean[] vst = new boolean[N+1];
			ans[1] = 1;

			for (int i = 1; i < M+1; i++) {
				if (!vst[s[i]]) {
					vst[s[i]] = true;
					ans[s[i]] = c[i];
				} else if (c[i] != ans[s[i]]) {
						f = false;
						break;
				}
			}

			if (!f || ans[1] == 0) {
				System.out.println(-1);
			} else {
				for (int i = 1; i < N+1; i++) {
					System.out.print(ans[i]);
				}
			}

		}

	}

}
