import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
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
	long result = 0;
	long[] A, B, C;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		A = new long[N];
		B = new long[N];
		C = new long[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			B[i] = Long.parseLong(tokens[i]);
		}
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			C[i] = Long.parseLong(tokens[i]);
		}
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
	}

	int getIndex(long[] array, long val) {
		// 真に少ないindexを返す
		int index = Arrays.binarySearch(array, val);
		if (index >= 0) {
			// 一致するものがあったので，1ずつ引いて行って真に小さいものが出ればそれを返す
			for (int i = index; i >= 0; --i) {
				if (array[i] < val) {
					return i;
				}
			}
			// ここまでくるということは，真に小さいものがなかった
			return -1;
		} else {
			// 挿入pointを求める
			index = (index + 1) * -1;
			index--;
			// N-1で切る
			return Math.min(index, N - 1);
		}
	}

	void calc() {
		for (int i = 0; i < N; ++i) {
			long c = C[i];
			int j = getIndex(B, c);
			if (j < 0) {
				continue;
			}
			for (int y = 0; y <= j; ++y) {
				int k = getIndex(A, B[y]);
				if (k < 0) {
					continue;
				}
				long addVal = (long) (k + 1);
				result += addVal;
			}
		}
	}

	void showResult() {
		System.out.println(result);
	}
}