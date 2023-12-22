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
	long K;
	long[] A;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		K = Long.parseLong(tokens[1]);
		A = new long[N];
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}
		Arrays.sort(A);
	}

	long getCutNum(long total, long len) {
		if (total % len == 0) {
			return total / len - 1L;
		} else {
			return total / len;
		}
	}

	boolean check(long len) {
		long count = 0L;
		for (int i = 0; i < N; ++i) {
			count += getCutNum(A[i], len);
		}
		if (count <= K) {
			return true;
		} else {
			return false;
		}
	}

	void calc() {
		long max = A[N - 1];
		long min = 1L;
		long result = -1L;

		while (true) {
			if (min == max) {
				result = min;
				break;
			} else if (min + 1L == max) {
				if (check(min)) {
					result = min;
					break;
				} else {
					result = max;
					break;
				}
			} else {
				long med = (max + min) / 2L;
				if (check(med)) {
					max = med;
				} else {
					min = med;
				}
			}
		}
		System.out.println(result);
	}

	void showResult() {
	}
}