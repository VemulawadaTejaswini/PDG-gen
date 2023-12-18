import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; ++i)
			a[i] = sc.nextInt();
		int c0 = 0, c1 = 0, c2 = 0;
		for (int i = 0; i < N; ++i) {
			int c = 0;
			while (a[i] % 2 == 0) {
				a[i] /= 2;
				++c;
			}
			c = Math.min(2, c);
			if (c == 0)
				++c0;
			else if (c == 1)
				++c1;
			else if (c == 2)
				++c2;
		}
		long[] ret = new long[N];
		for (int i = 0; i < N; ++i) {
			if (i == 0) {
				if (c0 > 0) {
					ret[0] = 0;
					--c0;
				} else if (c1 > 0) {
					ret[0] = 1;
					--c1;
				} else if (c2 > 0) {
					ret[0] = 2;
					--c2;
				}
				continue;
			} else {
				if (ret[i - 1] == 0) {
					if (c2 == 0) {
						System.out.println("No");
						return;
					} else {
						ret[i] = 2;
						--c2;
					}
				} else if (ret[i - 1] == 1) {
					if (c1 > 0) {
						ret[i] = 1;
						--c1;
					} else if (c2 > 0) {
						ret[i] = 2;
						--c2;
					} else {
						System.out.println("No");
						return;
					}
				} else if (ret[i - 1] == 2) {
					if (c0 > 0) {
						ret[i] = 0;
						--c0;
					} else if (c1 > 0) {
						ret[i] = 1;
						--c1;
					} else if (c2 > 0) {
						ret[i] = 2;
						--c2;
					} else {
						System.out.println("No");
						return;
					}
				}
			}
		}
		System.out.println("Yes");
	}
}