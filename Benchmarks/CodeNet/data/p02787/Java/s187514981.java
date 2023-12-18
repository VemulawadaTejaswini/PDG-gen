import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int H, N;
	int aMax, bMax;
	List<Pair> list;
	int result = 0;

	static class Pair {
		int A, B;

		Pair(int A, int B) {
			this.A = A;
			this.B = B;
		}

		void show() {
			double val = (double) A / (double) B;
			System.out.println(A + ", " + B + ", " + val);
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
		H = Integer.parseInt(tokens[0]);
		N = Integer.parseInt(tokens[1]);
		list = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			tokens = in.readLine().split(" ");
			list.add(new Pair(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1])));
		}
		Collections.sort(list, new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				double val1 = (double) o1.A / (double) o1.B;
				double val2 = (double) o2.A / (double) o2.B;
				if (val1 != val2) {
					return -1 * Double.compare(val1, val2);
				} else {
					return Integer.compare(o1.A, o2.A);
				}
			}
		});
		aMax = list.get(0).A;
		bMax = list.get(0).B;
	}

	void calc() {
		int[] magic = new int[H + 1];
		Arrays.fill(magic, 0);
		// 初期化
		Pair first = list.get(0);
		for (int i = 1; i <= Math.min(H, first.A); ++i) {
			magic[i] = first.B;
		}
		for (int i = first.A + 1; i <= H; ++i) {
			magic[i] = magic[i - first.A] + first.B;
		}

		// 順に適用していく
		for (int i = 1; i < list.size(); ++i) {
			Pair pair = list.get(i);
			for (int j = 1; j <= H; ++j) {
				if (j - pair.A < 0) {
					magic[j] = Math.min(magic[j], pair.B);
				} else {
					magic[j] = Math.min(magic[j], magic[j - pair.A] + pair.B);
				}
			}
		}

		result = magic[H];

	}

	void showResult() {
		System.out.println(result);
	}
}