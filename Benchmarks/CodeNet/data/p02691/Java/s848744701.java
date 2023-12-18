import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	long[] A;
	long count = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		tokens = in.readLine().split(" ");
		A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}
	}

	void calc() {
		for (int i = 0; i < N; ++i) {
			int upper = i + (int) A[i];
			for (int j = upper; j < N; ++j) {
				if (A[i] + A[j] == Math.abs(j - i)) {
					++count;
				}
			}
		}
		System.out.println(count);
	}

	void showResult() {
	}
}