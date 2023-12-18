package abc.abc124.a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int ans = max(A, B);
		System.out.println(ans);
        s.close();
	}

	public static int max(int A, int B) {
		int ans = A;

		if (B > ans) {
			ans = B;
			B--;
		} else {
			A--;
		}

		if (A >= B) {
			ans += A;
		} else {
			ans += B;
		}
		return ans;
	}
}
