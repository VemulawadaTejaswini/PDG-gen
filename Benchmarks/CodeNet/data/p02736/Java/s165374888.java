import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	int[] vals;
	String S;
	int result = 0;
	Map<String, String> cache;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		this.N = Integer.parseInt(in.readLine());
		this.vals = new int[N];
		S = in.readLine();
		for (int i = 0; i < N; ++i) {
			vals[i] = Integer.parseInt(S.substring(i, i + 1));
		}
	}

	int calc(int[] array) {
		if (array.length == 1) {
			return array[0];
		} else if (array.length == 2) {
			return Math.abs(array[1] - array[0]);
		} else {
			int[] next = new int[array.length - 1];
			for (int i = 0; i + 1 < array.length; ++i) {
				next[i] = Math.abs(array[i + 1] - array[i]);
			}
			return calc(next);
		}
	}

	void initCache() {
		cache = new HashMap<>();
		int[] array = new int[4];
		for (int i = 0; i < 4; ++i) {
			array[0] = i;
			for (int j = 0; j < 4; ++j) {
				array[1] = j;
				for (int k = 0; k < 4; ++k) {
					array[2] = k;
					for (int l = 0; l < 4; ++l) {
						array[3] = l;
						String key = Integer.toString(i) + Integer.toString(j) + Integer.toString(k)
								+ Integer.toString(l);
						cache.put(key, Integer.toString(calc(array)));
					}
				}
			}
		}
	}

	int calc(String str) {
		int[] array = new int[str.length()];
		for (int i = 0; i < str.length(); ++i) {
			array[i] = Integer.parseInt(str.substring(i, i + 1));
		}
		return calc(array);
	}

	int subCalc(String str) {
		if (str.length() <= 4) {
			return calc(str);
		} else {
			StringBuilder next = new StringBuilder();
			for (int i = 0; i + 4 < str.length(); ++i) {
				String s = cache.get(str.substring(i, i + 4));
				next.append(s);
			}
			return subCalc(next.toString());
		}
	}

	void calc() {
		initCache();
		result = subCalc(S);
	}

	void showResult() {
		System.out.println(result);
	}

}
