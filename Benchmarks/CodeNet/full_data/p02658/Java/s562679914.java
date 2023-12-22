import java.util.*;
import java.io.*;
import java.math.BigDecimal;
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
		int N = Integer.parseInt(in.readLine());

		String[] tokens = in.readLine().split(" ");
		long[] A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}
		Arrays.sort(A);
		BigDecimal result = new BigDecimal(A[0]);
		BigDecimal threshold = new BigDecimal(1000000000000000000L);
		for (int i = 1; i < N; ++i) {
			result = result.multiply(new BigDecimal(A[i]));
			if (result.compareTo(threshold) > 0) {
				System.out.println("-1");
				return;
			}
		}
		System.out.println(result);

	}

	void calc() {
	}

	void showResult() {
	}
}
