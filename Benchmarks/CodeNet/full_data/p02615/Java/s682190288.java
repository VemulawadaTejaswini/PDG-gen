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
			A[i] = Long.parseLong(tokens[i]);
		}
		Arrays.sort(A);
		long[] newA = new long[N];
		for (int i = N - 1; i >= 0; --i) {
			newA[i] = A[N - 1 - i];
		}
		A = newA;

	}

	void calc() {
		long result = 0;
		for (int i = 1; i < N; ++i) {
			result += A[i / 2];
		}
		System.out.println(result);
	}

	void showResult() {
	}
}
