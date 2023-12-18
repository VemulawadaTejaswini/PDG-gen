import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextLong();
		}
		Arrays.sort(A);
		long cum = 0;
		int idx = -1;
		for (int i = 0; i < N; ++i) {
			if (cum * 2 < A[i]) {
				idx = i;
			}
			cum += A[i];
		}
		System.out.println(N - idx);
	}
}
