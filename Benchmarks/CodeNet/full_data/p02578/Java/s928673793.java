import java.util.*;
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
	}

	void calc() {
		long sum = 0;
		long prevMax = A[0];
		for (int i = 1; i < N; ++i) {
			if (prevMax <= A[i]) {
				// なにもしない
			} else {
				sum += prevMax - A[i];
			}
			prevMax = Math.max(prevMax, A[i]);
		}
		System.out.println(sum);
	}

	void showResult() {
	}
}