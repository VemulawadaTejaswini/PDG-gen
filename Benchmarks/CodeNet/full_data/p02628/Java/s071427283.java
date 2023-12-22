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
	int[] p;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		K = Integer.parseInt(tokens[1]);
		tokens = in.readLine().split(" ");
		p = new int[N];
		for (int i = 0; i < N; ++i) {
			p[i] = Integer.parseInt(tokens[i]);
		}
		Arrays.sort(p);
		int sum = 0;
		for (int i = 0; i < K; ++i) {
			sum += p[i];
		}
		System.out.println(sum);
	}

	void calc() {
	}

	void showResult() {
	}
}
