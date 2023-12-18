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

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);
		int[] A = new int[M];
		tokens = in.readLine().split(" ");
		for (int i = 0; i < M; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
		long sum = 0;
		for (int i = 0; i < M; ++i) {
			sum += A[i];
		}
		if (sum > N) {
			System.out.println("-1");
		} else {
			System.out.println((N - sum));
		}
	}

	void calc() {
	}

	void showResult() {
	}
}
