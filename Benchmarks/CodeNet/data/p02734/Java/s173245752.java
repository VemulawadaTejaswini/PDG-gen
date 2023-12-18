import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, S;
	int[] A;
	long count = 0L;
	long MOD = 998244353L;
	long[] cache;

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
		S = Integer.parseInt(tokens[1]);
		A = new int[N];
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
	}

	void eval(int val) {
		// この値を既存の配列に追加する
		for (int i = val; i < S; ++i) {
			int targetIndex = i - val;
			cache[targetIndex] += cache[i];
		}
		// この値自身をタス
		if (S - val >= 0) {
			cache[S - val]++;
		}
		// 足した結果Sに到達したものをcountに加える
		count += cache[0];
		// 最後にmod化する
		for (int i = 0; i < cache.length; ++i) {
			cache[i] %= MOD;
		}
		count %= MOD;

	}

	void showCache(int index) {
		System.out.print(index + ": ");
		for (int i = 0; i <= S; ++i) {
			System.out.print(cache[i] + " ");
		}
		System.out.println("");
	}

	void calc() {
		// Sまでのこりいくつかという観点でcacheを持つ
		for (int j = 0; j < N; ++j) {
			this.cache = new long[3001];
			Arrays.fill(cache, 0L);
			for (int i = j; i < N; ++i) {
				eval(A[i]);
				//showCache(i);
			}
		}
	}

	void showResult() {
		System.out.println(count);
	}

}