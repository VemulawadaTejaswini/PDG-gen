import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
	int N;
	long[] A;
	long result = 0;

	long gcd(long large, long small) {
		if (large < small) {
			return gcd(small, large);
		}
		if (large == small) {
			return large;
		}
		if (large % small == 0) {
			return small;
		}
		return gcd(small, large % small);
	}

	void calc() {
		List<Long> gcds = new ArrayList<>();
		gcds.add(gcd(A[A.length - 1], A[A.length - 2]));
		int index = A.length - 2;
		for (int i = A.length - 3; i >= 0; --i) {
			long last = gcds.get(gcds.size() - 1);
			long g = gcd(last, A[i]);
			gcds.add(g);
			if (g < last) {
				index = i;
			}
		}

		if (index <= A.length - 3) {
			// その数を置き換える
			long r = A[A.length - 1];
			for (int i = A.length - 2; i >= 0; --i) {
				if (i == index) {
					continue;
				}
				r = gcd(r, A[i]);
			}
			this.result = r;
		} else {
			long r0 = A[A.length - 1];
			for (int i = A.length - 3; i >= 0; --i) {
				r0 = gcd(r0, A[i]);
			}
			long r1 = A[A.length - 2];
			for (int i = A.length - 3; i >= 0; --i) {
				r1 = gcd(r1, A[i]);
			}
			this.result = Math.max(r0, r1);
		}
	}

	Main() throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		N = Integer.parseInt(in.readLine());
		A = new long[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
		in.close();
		Arrays.sort(A);
		calc();
	}

	public static void main(String[] args) throws IOException {
		Main ins = new Main();
		System.out.println(ins.result);
	}

}