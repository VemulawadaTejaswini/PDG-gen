import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	char[] S;
	Map<Character, List<Integer>> map;
	long count = 0L;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		S = in.readLine().toCharArray();
		this.map = new HashMap<>();
		map.put('R', new ArrayList<Integer>());
		map.put('G', new ArrayList<Integer>());
		map.put('B', new ArrayList<Integer>());
		for (int i = 0; i < N; ++i) {
			map.get(S[i]).add(i);
		}
	}

	boolean check(int i, int j, int k) {
		if (i >= j || j >= k) {
			return false;
		}
		if (j - i == k - j) {
			return false;
		}
		return true;
	}

	void calc() {
		for (Integer i : map.get('R')) {
			for (Integer j : map.get('G')) {
				for (Integer k : map.get('B')) {
					if (check(i, j, k)) {
						++count;
					}
					if (check(i, k, j)) {
						++count;
					}
					if (check(j, i, k)) {
						++count;
					}
					if (check(j, k, i)) {
						++count;
					}
					if (check(k, i, j)) {
						++count;
					}
					if (check(k, j, i)) {
						++count;
					}
				}
			}
		}
	}

	void showResult() {
		System.out.println(count);
	}
}