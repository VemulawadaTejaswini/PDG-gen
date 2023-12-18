import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int N;
	long[] A;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		A = new long[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]) - (long) (i + 1);
		}
		Arrays.sort(A);
		long med = getMedium();

		long result = Long.MAX_VALUE / 2;
		for (long b = med - 5; b <= med + 5; ++b) {
			result = Math.min(result, sub(b));
		}
		System.out.println(result);
	}

	long getMedium() {
		if (A.length % 2 == 1) {
			return A[A.length / 2 + 1];
		} else {
			return (A[A.length / 2] + A[A.length / 2 + 1]) / 2;
		}
	}

	long sub(long b) {
		long result = 0;
		for (int i = 0; i < N; ++i) {
			result += Math.abs(A[i] - b);
		}
		return result;
	}

	void calc() {
	}

	void showResult() {
	}
}