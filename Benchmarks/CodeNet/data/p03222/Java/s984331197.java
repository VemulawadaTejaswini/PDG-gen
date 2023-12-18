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

	int H, W, K;
	static long MOD = 1000000007L;
	long[][] patterns;
	long[][] pat;
	long[] singles;
	long[] doubles;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		H = Integer.parseInt(tokens[0]);
		W = Integer.parseInt(tokens[1]);
		K = Integer.parseInt(tokens[2]) - 1;
		patterns = new long[H + 1][W];
		Arrays.fill(patterns[0], 0L);
		patterns[0][0] = 1L;
		initPat();
	}

	boolean[] genSwapPattern(int val, int len) {
		boolean[] swapPat = new boolean[len];
		for (int i = 0; i < len; ++i) {
			if ((val & 1) > 0) {
				swapPat[i] = true;
			} else {
				swapPat[i] = false;
			}
			val >>= 1;
		}
		return swapPat;
	}

	boolean checkSwapPat(boolean[] swapPat) {
		for (int i = 0; i + 1 < swapPat.length; ++i) {
			if (swapPat[i] && swapPat[i + 1]) {
				return false;
			}
		}
		return true;
	}

	List<boolean[]> genSwapPatterns() {
		List<boolean[]> swapPatterns = new ArrayList<>();
		for (int i = 0; i < Math.pow(2.0, W - 1); ++i) {
			boolean[] swapPat = genSwapPattern(i, W - 1);
			if (checkSwapPat(swapPat)) {
				swapPatterns.add(swapPat);
			}
		}
		return swapPatterns;
	}

	void initPat() {
		if (W == 1) {
			return;
		}
		singles = new long[W - 1];
		doubles = new long[W];
		Arrays.fill(singles, 0L);
		Arrays.fill(doubles, 0L);

		List<boolean[]> swapPatterns = genSwapPatterns();
		for (int i = 0; i < swapPatterns.size(); ++i) {
			boolean[] swapPat = swapPatterns.get(i);
			for (int j = 0; j < W - 1; ++j) {
				if (swapPat[j]) {
					singles[j]++;
				}
			}
			if (!swapPat[0]) {
				doubles[0]++;
			}
			if (!swapPat[W - 2]) {
				doubles[W - 1]++;
			}
			for (int j = 1; j < W - 1; ++j) {
				if (!swapPat[j - 1] && !swapPat[j]) {
					doubles[j]++;
				}
			}
		}
//		for (int i = 0; i < singles.length; ++i) {
//			System.out.print(singles[i] + " ");
//		}
//		System.out.println("");
//		for (int i = 0; i < doubles.length; ++i) {
//			System.out.print(doubles[i] + " ");
//		}
//		System.out.println("");
	}

	void calc() {
		if (W == 1) {
			return;
		}
		for (int i = 1; i <= H; ++i) {
			Arrays.fill(patterns[i], 0L);
			// 一番左
			patterns[i][0] += patterns[i - 1][0] * doubles[0] + patterns[i - 1][1] * singles[0];
			// 一番右
			patterns[i][W - 1] += patterns[i - 1][W - 1] * doubles[W - 1] + patterns[i - 1][W - 2] * singles[W - 2];
			for (int j = 1; j < W - 1; ++j) {
				patterns[i][j] += patterns[i - 1][j] * doubles[j] + patterns[i - 1][j - 1] * singles[j - 1]
						+ patterns[i - 1][j + 1] * singles[j];
			}
			for (int j = 0; j < W; ++j) {
				patterns[i][j] %= MOD;
				// System.out.print(" " + patterns[i][j]);
			}
			// System.out.println("");
		}
	}

	void showResult() {
		if (W == 1) {
			System.out.println(1);
		} else {
			System.out.println(patterns[H][K]);
		}
	}
}
