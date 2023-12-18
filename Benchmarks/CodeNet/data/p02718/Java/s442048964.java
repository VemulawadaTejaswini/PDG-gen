
import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, M;
	List<Integer> A;
	boolean result = false;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		this.N = Integer.parseInt(tokens[0]);
		this.M = Integer.parseInt(tokens[1]);
		tokens = in.readLine().split(" ");
		this.A = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			this.A.add(Integer.parseInt(tokens[i]));
		}
		Collections.sort(this.A);
		Collections.reverse(this.A);
	}

	void calc() {
		int sum = 0;
		for (int i = 0; i < N; ++i) {
			sum += A.get(i);
		}
		double threshold = sum / (4.0 * (double) M);
		int count = 0;

		for (int i = 0; i < N; ++i) {
			if (A.get(i) < threshold) {
				break;
			}
			++count;
		}
		if (count >= M) {
			result = true;
		}
	}

	void showResult() {
		System.out.println(result ? "Yes" : "No");
	}

}
