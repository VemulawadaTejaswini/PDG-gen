import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		System.out.print(process(s));
		in.close();
	}

	public static String process(String s) {
		if (null == s || s.length() == 0) {
			return s;
		}

		char[] A = s.toCharArray();
		int N = A.length;
		if (N == 1) {
			A[0] = A[0] == '?' ? 'D' : A[0];
		} else {
			for (int i = 0; i < N; i++) {

				if (A[i] != '?') {
					continue;
				}

				if (i == 0) {
					A[i] = A[i + 1] == 'P' ? 'D' : 'P';
				} else if (i == N - 1) {
					A[i] = 'D';
				} else {
					if (A[i - 1] == 'P') {
						A[i] = 'D';
					} else if (A[i + 1] == '?' || A[i + 1] == 'D') {
						A[i] = 'P';
					} else {
						A[i] = 'D';
					}
				}
			}
		}
		return new String(A);
	}

}
