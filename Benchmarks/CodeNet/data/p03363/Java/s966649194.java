import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static long tmp;

	public static void main(String args[]) {

		FastReader s = new FastReader();
		int N = s.nextInt();
		long[] numArr = new long[N];
		int count = 0;

		for (int i = 0; i < N; i++) {
			numArr[i] = Long.parseLong(s.next());
		}

		int ir = 0;
		for (int i = ir; i < N - 1; i++) {
			if (i == ir) {
				tmp = numArr[i];
			}
			if (tmp + numArr[i + 1] == 0) {
				count++;
			}

			tmp += numArr[i + 1];
			if (i == N - 2) {
				i = ir;
				ir++;
			}
		}

		System.out.println(count);


	}
}

class FastReader {
	BufferedReader br;
	StringTokenizer st;

	public FastReader() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}

	long nextLong() {
		return Long.parseLong(next());
	}

	double nextDouble() {
		return Double.parseDouble(next());
	}

	String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}
