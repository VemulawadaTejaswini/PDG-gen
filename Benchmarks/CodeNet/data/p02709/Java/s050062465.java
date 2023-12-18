import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	Tuple[] A;
	Tuple[] modA;

	static class Tuple {
		int id;
		long val;

	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		A = new Tuple[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			Tuple tuple = new Tuple();
			tuple.id = i;
			tuple.val = Long.parseLong(tokens[i]);
			A[i] = tuple;
		}
		modA = new Tuple[N];
	}

	void calc() {
		int first = 0;
		int last = N - 1;
		Arrays.sort(A, new Comparator<Tuple>() {
			@Override
			public int compare(Tuple o1, Tuple o2) {
				return -1 * Long.compare(o1.val, o2.val);
			}
		});
		for (int i = 0; i < N; ++i) {
			Tuple tuple = A[i];
			if (Math.abs(tuple.id - first) > Math.abs(tuple.id - last)) {
				// 先頭側に入れる
				modA[first] = tuple;
				first++;
			} else {
				modA[last] = tuple;
				last--;
			}
		}
	}

	void showResult() {
		long sum = 0;
		for (int i = 0; i < N; ++i) {
			// System.out.println(i + " " + modA[i].id + " " + modA[i].val);
			sum += Math.abs(i - modA[i].id) * modA[i].val;
		}
		System.out.println(sum);
	}
}