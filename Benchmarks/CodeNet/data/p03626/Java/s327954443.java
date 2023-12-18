
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
	char[][] map;
	int[] map2;
	List<Integer> list;
	long[] memo;
	long MOD = 1000000007L;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		map = new char[2][N];
		for (int i = 0; i < 2; ++i) {
			String line = in.readLine();
			for (int j = 0; j < N; ++j) {
				map[i][j] = line.charAt(j);
			}
		}
		// mapを置き換え
		map2 = new int[N];
		for (int i = 0; i < N; ++i) {
			if (map[0][i] == map[1][i]) {
				// 縦
				map2[i] = 0;
			} else {
				map2[i] = 1;
			}
		}
		// さらに置き換え
		list = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			if (map2[i] == 0) {
				list.add(0);
			} else {
				list.add(1);
				++i;
			}
		}
		memo = new long[list.size()];
		Arrays.fill(memo, 0L);
	}

	void calc() {
		if (list.get(0) == 0) {
			memo[0] = 3;
		} else {
			memo[0] = 6;
		}
		for (int i = 1; i < list.size(); ++i) {
			if (list.get(i - 1) == 0) {
				if (list.get(i) == 0) {
					memo[i] = memo[i - 1] * 2L;
					memo[i] %= MOD;
				} else {
					memo[i] = memo[i - 1] * 2L;
					memo[i] %= MOD;
				}
			} else {
				if (list.get(i) == 0) {
					memo[i] = memo[i - 1];
				} else {
					memo[i] = memo[i - 1] * 3L;
					memo[i] %= MOD;
				}
			}
		}
		System.out.println(memo[list.size() - 1]);
	}

	void showResult() {
	}
}
