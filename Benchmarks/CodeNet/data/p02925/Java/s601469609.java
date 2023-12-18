import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());

		int[][] matches = new int[N][N - 1];
		for (int i = 0; i < N; ++i) {
			Arrays.fill(matches[i], 0);
		}
		int[] indexes = new int[N];
		Arrays.fill(indexes, 0);
		for (int i = 0; i < N; ++i) {
			String[] tokens = in.readLine().split(" ");
			for (int j = 0; j < tokens.length; ++j) {
				matches[i][j] = Integer.parseInt(tokens[j]) - 1;
			}
		}

		int doneMatchNum = 0;
		boolean possible = true;
		int days = 0;
		while (doneMatchNum < ((N - 1) * N / 2)) {
			Set<Integer> done = new HashSet<>();
			for (int i = 0; i < N; ++i) {
				if (indexes[i] >= N - 1) {
					continue;
				}
				if (done.contains(i)) {
					continue;
				}
				int target = matches[i][indexes[i]];
				if (done.contains(target)) {
					continue;
				}
				if (matches[target][indexes[target]] == i) {
					// 対戦成立
					done.add(i);
					done.add(target);
					indexes[i]++;
					indexes[target]++;
					doneMatchNum++;
				}
			}
			if (done.isEmpty()) {
				possible = false;
				break;
			}
			++days;
		}
		if (!possible) {
			System.out.println("-1");
		} else {
			System.out.println(days);
		}

	}

}