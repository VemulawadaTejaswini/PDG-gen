import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Pair {
		int l, r;
		char c;

		Pair(int l, int r, char c) {
			this.l = l;
			this.r = r;
			this.c = c;
		}

		int getLen() {
			return r - l + 1;
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int K = Integer.parseInt(tokens[1]);
		char[] str = in.readLine().toCharArray();
		Deque<Pair> que = new ArrayDeque<>();
		que.add(new Pair(0, 0, str[0]));
		for (int i = 1; i < str.length; ++i) {
			Pair last = que.getLast();
			if (last.c == str[i]) {
				que.getLast().r = i;
			} else {
				que.addLast(new Pair(i, i, str[i]));
			}
		}

		// 配列化
		Pair[] pairs = que.toArray(new Pair[0]);
		if (pairs.length <= 2 * K) {
			// 全部反転可能
			System.out.println(N - 1);
			return;
		}
		// 反転によって連続が最大になる範囲を求める
		int min = -1, max = -1, size = -1;
		for (int i = 0; i < pairs.length; ++i) {
			int toIndex = i + 2 * K;
			if (toIndex >= pairs.length) {
				toIndex = (((pairs.length - 1) - i) / 2) * 2;
			}
			int s = pairs[toIndex].r - pairs[i].l + 1;
			if (s > size) {
				size = s;
				min = pairs[i].l;
				max = pairs[toIndex].r;
			}
		}
		int min2 = -1, max2 = -1, size2 = -1;
		for (int i = 1; i < pairs.length; ++i) {
			int toIndex = i + 2 * K;
			if (toIndex >= pairs.length) {
				toIndex = (((pairs.length - 1) - i) / 2) * 2;
			}
			int s = pairs[toIndex].r - pairs[i].l + 1;
			if (s > size2) {
				size2 = s;
				min2 = pairs[i].l;
				max2 = pairs[toIndex].r;
			}
		}
		if (size2 > size) {
			size = size2;
			max = max2;
			min = min2;
		}
		// 反転処理
		Arrays.fill(str, min, max + 1, str[min]);

		// うれしい人を数える
		int count = 0;
		if (str.length >= 2) {
			if (str[0] == 'R') {
				if (str[0] == str[1]) {
					++count;
				}
			}
			if (str[N - 1] == 'L') {
				if (str[N - 1] == str[N - 2]) {
					++count;
				}
			}
			for (int i = 1; i < N - 1; ++i) {
				int target = -1;
				if (str[i] == 'R') {
					target = i + 1;
				} else
					target = i - 1;
				if (str[i] == str[target]) {
					++count;
				}
			}
		}
		System.out.println(count);
	}

}