import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int N;
	static long[] A;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = new long[N];
		long s = 0;
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextLong();
			s += A[i];
		}
		if (s % (N * (N + 1) / 2) != 0) {
			System.out.println("NO");
			return;
		}
		int K = (int) (s / (((long) N * (N + 1) / 2)));
		long[] diff = new long[N];
		for (int i = 0; i < N; ++i) {
			diff[i] = (A[(i + 1) % N] - A[i]);
		}
		for (int i = 0; i < N; ++i) {
			diff[i] -= K;
			if (diff[i] > 0) {
				System.out.println("NO");
				return;
			}
		}

		for (int i = 0; i < N; ++i) {
			if ((-diff[i]) % N != 0) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");

	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
