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

	int N;
	long A, B;
	long[] h;
	long max, min;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		A = Long.parseLong(tokens[1]);
		B = Long.parseLong(tokens[2]);
		h = new long[N];
		for (int i = 0; i < N; ++i) {
			h[i] = Long.parseLong(in.readLine());
		}
		Arrays.sort(h);
		// 最大の回数 = h_max / B，この回数なら確実にできる
		max = h[N - 1] / B + 1;
		// 最小の回数 = h_max / A，個の回数ではできない
		min = h[N - 1] / A;
	}

	boolean isEnable(long times) {
		List<Long> list = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			long val = B * times;
			if (h[i] > val) {
				list.add(h[i] - val);
			}
		}
		long t = 0L;
		for (Long v : list) {
			if (v % (A - B) == 0) {
				t += v / (A - B);
			} else {
				t += v / (A - B) + 1L;
			}
		}
		if (times >= t) {
			return true;
		} else {
			return false;
		}
	}

	void calc() {
		long result = -1L;
		while (true) {
			// System.out.println(min + " " + max);
			if (max == min) {
				result = min;
				break;
			} else if (max - min == 1L) {
				if (isEnable(min)) {
					result = min;
				} else {
					result = max;
				}
				break;
			} else {
				long middle = (max + min) / 2L;
				if (isEnable(middle)) {
					max = middle;
				} else {
					min = middle;
				}
			}
		}
		System.out.println(result);
	}

	void showResult() {

	}
}