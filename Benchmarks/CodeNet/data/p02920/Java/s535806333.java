import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		int N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		Long[] S = new Long[tokens.length];
		for (int i = 0; i < tokens.length; ++i) {
			S[i] = Long.parseLong(tokens[i]);
		}
		Arrays.sort(S, new Comparator<Long>() {
			@Override
			public int compare(Long o1, Long o2) {
				return -1 * Long.compare(o1, o2);
			}
		});
		// baseとなるqueを作成
		Deque<Long> que = new ArrayDeque<>(S.length);
		for (int i = 0; i < S.length; ++i) {
			que.addLast(S[i]);
		}
		Long[] array = new Long[1];
		array[0] = que.pollFirst();
		for (int i = 0; i < N; ++i) {
			array = step(array, que);
			if (array == null) {
				break;
			}
		}
		// System.out.println(toStr(array));
		// arrayの検証
		/*
		for (int i = 0; i < N; ++i) {
			array = revStep(array);
			if (array == null) {
				break;
			}
		}*/
		if (array != null) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	static Long[] revStep(Long[] base) {
		// 条件チェック
		for (int i = 0; i < base.length; i += 2) {
			if (base[i] <= base[i + 1]) {
				return null;
			}
		}
		Long[] nexts = new Long[base.length / 2];
		for (int i = 0; i < nexts.length; ++i) {
			nexts[i] = base[i * 2];
		}

		return nexts;
	}

	static Long[] step(Long[] base, Deque<Long> que) {
		Long[] nexts = new Long[base.length * 2];
		// base要素のコピー
		for (int i = 0; i < base.length; ++i) {
			nexts[i * 2] = base[i];
		}
		// 追加
		for (int i = 1; i < nexts.length; i += 2) {
			Long val = search(que, nexts[i - 1]);
			if (val < 0) {
				return null;
			}
			nexts[i] = val;
		}
		return nexts;
	}

	/*
	 * 
	 */
	static Long search(Deque<Long> que, Long val) {
		Deque<Long> temp = new ArrayDeque<>(que.size());
		Long result = -1L;
		while (!que.isEmpty()) {
			if (que.peekFirst() < val) {
				result = que.pollFirst();
				break;
			} else {
				temp.addLast(que.pollFirst());
			}
		}
		// 残りのものを戻す
		while (!temp.isEmpty()) {
			que.addFirst(temp.pollLast());
		}
		return result;
	}

	static String toStr(Long[] array) {
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < array.length; ++i) {
			strBuilder.append(" " + array[i]);
		}
		return strBuilder.toString();
	}
}