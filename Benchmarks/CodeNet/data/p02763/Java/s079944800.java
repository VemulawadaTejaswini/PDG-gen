import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	char[] S;
	int Q;
	Query[] queries;
	Map<Character, List<Integer>> map;

	static class Query {
		int type;
		int i, l, r;
		char c;

		Query(String line) {
			String[] tokens = line.split(" ");
			type = Integer.parseInt(tokens[0]);
			if (type == 1) {
				i = Integer.parseInt(tokens[1]) - 1;
				c = tokens[2].charAt(0);
			} else {
				l = Integer.parseInt(tokens[1]) - 1;
				r = Integer.parseInt(tokens[2]) - 1;
			}
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
		N = Integer.parseInt(in.readLine());
		S = in.readLine().toCharArray();
		Q = Integer.parseInt(in.readLine());
		queries = new Query[Q];
		for (int i = 0; i < Q; ++i) {
			queries[i] = new Query(in.readLine());
		}
		this.map = new HashMap<>();
		// まず全アルファベットだけ用意する
		for (int i = (int) 'a'; i <= (int) 'z'; ++i) {
			char c = (char) i;
			map.put(c, new ArrayList<>());
		}
		for (int i = 0; i < N; ++i) {
			Character c = S[i];
			map.get(c).add(i);
		}
	}

	boolean check(int l, int r, List<Integer> positions) {
		if (positions.isEmpty()) {
			return false;
		}
		if (r < positions.get(0)) {
			return false;
		}
		if (positions.get(positions.size() - 1) < l) {
			return false;
		}
		int posL = Collections.binarySearch(positions, l);
		int posR = Collections.binarySearch(positions, r);
		if (posL >= 0 && posR >= 0) {
			return true;
		} else {
			if (posL == posR) {
				return false;
			} else {
				return true;
			}
		}
	}

	int eval(Query query) {
		if (query.type == 1) {
			// replaceする
			char old = S[query.i];
			S[query.i] = query.c;
			// list側もreplaceする
			int index = Collections.binarySearch(map.get(old), query.i);
			map.get(old).remove(index);
			// insertするindexを求める
			int index2 = Collections.binarySearch(map.get(query.c), query.i);
			index2 = (index2 + 1) * -1;
			map.get(query.c).add(index2, query.i);
			return -1;
		} else {
			// countする
			int count = 0;
			for(List<Integer> list: map.values()) {
				if(check(query.l, query.r, list)) {
					++count;
				}
			}
			return count;
		}
	}

	void calc() {
		for (int i = 0; i < Q; ++i) {
			int count = eval(queries[i]);
			if (count >= 0) {
				System.out.println(count);
			}
		}
	}

	void showResult() {
	}

}
