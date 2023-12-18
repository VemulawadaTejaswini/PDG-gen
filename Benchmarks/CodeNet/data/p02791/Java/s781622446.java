import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	int[] P;
	List<Integer> results = new ArrayList<>();

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
		P = new int[N];
		for (int i = 0; i < N; ++i) {
			P[i] = Integer.parseInt(tokens[i]);
		}
	}

	void calc() {
		// 先頭は条件を満たす
		results.add(P[0]);
		int prevMin = P[0];
		for (int i = 1; i < N; ++i) {
			if (prevMin >= P[i]) {
				results.add(P[i]);
				prevMin = P[i];
			}
		}
	}

	void showResult() {
		System.out.println(results.size());
	}
}
