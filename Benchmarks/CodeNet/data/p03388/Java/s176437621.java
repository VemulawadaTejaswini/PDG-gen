import java.util.*;
import java.util.stream.Collectors;
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

	int Q;
	Tuple[] queries;

	static class Tuple {
		long A, B;

		Tuple(String line) {
			String[] tokens = line.split(" ");

			long a = Long.parseLong(tokens[0]);
			long b = Long.parseLong(tokens[1]);
			if (a > b) {
				this.A = b;
				this.B = a;
			} else {
				this.A = a;
				this.B = b;
			}
		}

		long calc() {
			if (A == B) {
				return 2L * A - 2L;
			} else if (A + 1L == B) {
				return 2L * A - 2L;
			} else {
				long C = (long) Math.floor(Math.sqrt((double) A * (double) B - 1L));
				if (C * (C + 1L) >= A * B) {
					return 2L * C - 2L;
				} else {
					return 2L * C - 1L;
				}
			}
		}
	}

	Main(BufferedReader in) throws IOException {
		Q = Integer.parseInt(in.readLine());
		queries = new Tuple[Q];
		for (int i = 0; i < Q; ++i) {
			queries[i] = new Tuple(in.readLine());
		}
	}

	void calc() {
		for (int i = 0; i < Q; ++i) {
			System.out.println(queries[i].calc());
		}
	}

	void showResult() {
	}
}