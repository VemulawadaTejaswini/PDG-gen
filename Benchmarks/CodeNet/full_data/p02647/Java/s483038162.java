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

	int N, K;
	int[] A;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		K = Integer.parseInt(tokens[1]);
		tokens = in.readLine().split(" ");
		A = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
	}

	int[] update(int[] A) {
		int[] B = new int[N];
		Arrays.fill(B, 0);
		for (int i = 0; i < N; ++i) {
			for (int j = Math.max(i - A[i], 0); j <= Math.min(i + A[i], N - 1); ++j) {
				B[j]++;
			}
		}
		return B;
	}

	void calc() {
		for (int i = 0; i < K; ++i) {
			A = update(A);
		}
	}

	void showResult() {
		System.out.print(A[0]);
		for (int i = 1; i < N; ++i) {
			System.out.print(" " + A[i]);
		}
		System.out.println("");
	}
}