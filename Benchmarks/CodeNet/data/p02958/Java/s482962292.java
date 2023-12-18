import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		for (int i = 0; i < N; ++i) {
			P[i] = sc.nextInt();
			--P[i];
		}
		boolean ans = false;
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				if (i != j) {
					P[i] ^= P[j];
					P[j] ^= P[i];
					P[i] ^= P[j];
				}
				boolean ok = true;
				for (int k = 0; k < N; ++k) {
					ok &= P[k] == k;
				}
				ans |= ok;
				if (i != j) {
					P[i] ^= P[j];
					P[j] ^= P[i];
					P[i] ^= P[j];
				}
			}
		}
		System.out.println(ans ? "YES" : "NO");
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}