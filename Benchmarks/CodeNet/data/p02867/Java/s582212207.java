
import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Tuple {
		long a, b;

		Tuple(long a, long b) {
			this.a = a;
			this.b = b;
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		Tuple[] pairs = new Tuple[N];
		long[] A = new long[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			pairs[i] = new Tuple(A[i], Long.parseLong(tokens[i]));
		}
		Arrays.sort(A);
		Arrays.sort(pairs, new Comparator<Tuple>() {
			@Override
			public int compare(Tuple o1, Tuple o2) {
				if (o1.b != o2.b) {
					return Long.compare(o1.b, o2.b);
				} else {
					return -1 * Long.compare(o1.a, o2.a);
				}
			}
		});
		// 共通の要素があればよい
		boolean enable = false;
		if (check(A, pairs)) {
			if (N % 2 == 0) {
				enable = true;
			} else {
				for (int i = 0; i < N; ++i) {
					if (A[i] == pairs[i].a) {
						enable = true;
						break;
					}
				}
			}
		}
		if (enable) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	/**
	 * そもそも可能かを調べる
	 * 
	 * @param A
	 * @param pairs
	 * @return
	 */
	static boolean check(long[] A, Tuple[] pairs) {
		boolean enable = true;
		for (int i = 0; i < A.length; ++i) {
			if (A[i] > pairs[i].b) {
				enable = false;
				break;
			}
		}
		return enable;
	}
}