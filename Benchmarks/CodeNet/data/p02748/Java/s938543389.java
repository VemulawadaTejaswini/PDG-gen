import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {
	int[] a, b;
	int A, B, M;
	List<Tuple> list;
	int aMin, bMin;

	static class Tuple {
		int x, y, c;

		Tuple(String line) {
			String[] tokens = line.split(" ");
			x = Integer.parseInt(tokens[0]) - 1;
			y = Integer.parseInt(tokens[1]) - 1;
			c = Integer.parseInt(tokens[2]);
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		A = Integer.parseInt(tokens[0]);
		B = Integer.parseInt(tokens[1]);
		M = Integer.parseInt(tokens[2]);

		this.a = new int[A];
		this.b = new int[B];
		tokens = in.readLine().split(" ");
		aMin = Integer.MAX_VALUE / 2;
		for (int i = 0; i < A; ++i) {
			a[i] = Integer.parseInt(tokens[i]);
			aMin = Math.min(aMin, a[i]);
		}
		tokens = in.readLine().split(" ");
		bMin = Integer.MAX_VALUE / 2;
		for (int i = 0; i < B; ++i) {
			b[i] = Integer.parseInt(tokens[i]);
			bMin = Math.min(bMin, b[i]);
		}
		this.list = new ArrayList<>(M);
		for (int i = 0; i < M; ++i) {
			list.add(new Tuple(in.readLine()));
		}
	}

	void calc() {

		int result = aMin + bMin;
		for (Tuple tuple : list) {
			int val = a[tuple.x] + b[tuple.y] - tuple.c;
			result = Math.min(val, result);
		}
		System.out.println(result);
	}

	void showResult() {

	}

}
