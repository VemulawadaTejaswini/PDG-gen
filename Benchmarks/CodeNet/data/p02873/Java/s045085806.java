import java.util.Scanner;

import static java.lang.System.in;

public final class Main {
	static Scanner sc = new Scanner(in);

	public static void main(String[] args) {
		char[] S = sc.next().toCharArray();
		int N = S.length + 1;
		int[] l = new int[N];
		int[] r = new int[N];
		for (int i = 1; i < N; i++) {
			if (S[i - 1] == '<') {
				l[i] = l[i - 1] + 1;
			}
		}
		for (int i = N - 2; i >= 0; i--) {
			if (S[i] == '>') {
				r[i] = r[i + 1] + 1;
			}
		}
		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += Math.max(l[i], r[i]);
		}
		System.out.println(ans);
	}
}
