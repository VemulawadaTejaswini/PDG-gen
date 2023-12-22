import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, M, Q;
	List<Tuple> list;
	long result = 0L;

	static class Tuple {
		int a, b, c, d;

		Tuple(String line) {
			String[] tokens = line.split(" ");
			a = Integer.parseInt(tokens[0]) - 1;
			b = Integer.parseInt(tokens[1]) - 1;
			c = Integer.parseInt(tokens[2]);
			d = Integer.parseInt(tokens[3]);
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
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		Q = Integer.parseInt(tokens[2]);
		list = new ArrayList<>(Q);
		for (int i = 0; i < Q; ++i) {
			list.add(new Tuple(in.readLine()));
		}
	}

	List<int[]> getValues(int prevVal, int remain) {
		if (remain == 0) {
			List<int[]> l = new ArrayList<>();
			for (int i = prevVal; i <= M; ++i) {
				int[] array = new int[N];
				array[N - 1] = i;
				l.add(array);
			}
			return l;
		} else {
			List<int[]> l = new ArrayList<>();
			for (int i = prevVal; i <= M; ++i) {
				List<int[]> nextL = getValues(i, remain - 1);
				for (int j = 0; j < nextL.size(); ++j) {
					nextL.get(j)[N - 1 - remain] = i;
					l.add(nextL.get(j));
				}
			}
			return l;
		}
	}

	long eval(int[] array, List<Tuple> list) {
		long sum = 0L;
		for (Tuple tuple : list) {
			if (array[tuple.b] - array[tuple.a] == tuple.c) {
				sum += tuple.d;
			}
		}
		return sum;

	}

	void calc() {
		List<int[]> arrays = getValues(1, N-1);
		for (int[] array : arrays) {
			result = Math.max(result, eval(array, list));
		}
		System.out.println(result);
	}

	void showResult() {
	}

}