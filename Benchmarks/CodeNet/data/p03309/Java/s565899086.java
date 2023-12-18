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
		long sum = 0L;
		for (int i = 0; i < N; ++i) {
			sum += A[i];
		}
		sum /= (long) N;
		long result = Long.MAX_VALUE / 2;
		for (long b = sum - 1; b <= sum + 1; ++b) {
			result = Math.min(result, sub(b));
		}
		System.out.println(result);
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