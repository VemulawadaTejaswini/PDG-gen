import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	List<Pair> list;
	int result = 0;

	static class Pair {
		int index;
		int A, B;

		Pair(int index, int a, int b) {
			this.A = a;
			this.B = b;
			this.index = index;
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
		this.N = Integer.parseInt(in.readLine());
		this.list = new ArrayList<>(N);
		String[] tokens = in.readLine().split(" ");
		String[] tokens2 = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			list.add(new Pair(i, Integer.parseInt(tokens[i]), Integer.parseInt(tokens2[i])));
		}
	}

	int getValue(Pair pair, int index) {
		if (Math.abs(pair.index - index) % 2 == 0) {
			// Aが選ばれる
			return pair.A;
		} else {
			return pair.B;
		}
	}

	List<List<Pair>> search(List<Pair> remains, int last, List<Pair> prevs) {
		// 追加先のindex
		int index = prevs.size();
		if (remains.size() == 1) {
			// この要素が追加できるかどうか
			if (last <= getValue(remains.get(0), index)) {
				// 追加できる: prevsに追加したものを返す
				List<Pair> l = new ArrayList<>();
				l.addAll(prevs);
				l.add(remains.get(0));
				List<List<Pair>> r = new ArrayList<>();
				r.add(l);
				return r;
			} else {
				// 追加できなかった
				return null;
			}
		} else {
			List<List<Pair>> result = new ArrayList<>();
			// これらに，remainsの各要素を先頭にもっていった場合を考える
			for (int i = 0; i < remains.size(); ++i) {
				Pair top = remains.get(i);
				// これが追加可能か判定
				int newLast = getValue(top, index);
				if (newLast < last) {
					// 追加できない
					continue;
				}

				List<Pair> newRemains = new ArrayList<>();
				newRemains.addAll(remains);
				newRemains.remove(i);
				List<Pair> newPrevs = new ArrayList<>();
				newPrevs.addAll(prevs);
				newPrevs.add(top);
				List<List<Pair>> searchResult = search(newRemains, newLast, newPrevs);
				if (searchResult != null) {
					result.addAll(searchResult);
				}
			}
			if (!result.isEmpty()) {
				return result;
			} else {
				return null;
			}

		}
	}

	int getSwapNum(List<Pair> list) {
		// まず逆向きにする
		// Collections.reverse(list);
		int result = 0;
		for (int i = 0; i < list.size(); ++i) {
			result += Math.abs(list.get(i).index - i);
		}
		return result / 2;
	}

	void calc() {
		List<List<Pair>> sorted = search(list, 0, new ArrayList<Pair>());
		if (sorted == null) {
			result = -1;
		} else {
			result = Integer.MAX_VALUE / 2;
			for (int i = 0; i < sorted.size(); ++i) {
				result = Math.min(result, getSwapNum(sorted.get(i)));
			}
		}

	}

	void showResult() {
		System.out.println(result);
	}
}