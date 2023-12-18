import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	int[] A;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		A = new int[N];
		Arrays.fill(A, 0);
		for (int i = 1; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i - 1]) - 1;
		}
		int[] sums = new int[N];
		Arrays.fill(sums, 0);
		for (int i = 1; i < N; ++i) {
			sums[A[i]]++;
		}
		for (int i = 0; i < N; ++i) {
			System.out.println(sums[i]);
		}
	}

	void calc() {
	}

	void showResult() {
	}
}
