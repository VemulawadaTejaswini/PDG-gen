/**
 * Worst Sportswriter
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int n = parseInt(br.readLine());
		int m = parseInt(br.readLine());
		List<Integer>[] indeg = new List[n + 1];
		List<Integer>[] outdeg = new List[n + 1];
		List<Integer> idx = new ArrayList<Integer>();
		Deque<Integer> rank = new ArrayDeque<Integer>();
		boolean alt = false;

		for (int i = 1; i <= n; i++) {
			indeg[i] = new ArrayList<Integer>();
			outdeg[i] = new ArrayList<Integer>();
			idx.add(i);
		}
		for (int i = 0; i < m; i++) {
			line = br.readLine();
			int a = parseInt(line.substring(0, line.indexOf(' ')));
			int b = parseInt(line.substring(line.indexOf(' ') + 1));
			indeg[b].add(a);
			outdeg[a].add(b);
		}
		//solve
		while (!idx.isEmpty()) {
			if (!alt) {
				int winners = 0;
				for (Integer winner : idx) {
					if (indeg[winner].size() == 0) winners++;
					if (winners > 1) {
						alt = true;
						break;
					}
				}
			}
			for (Integer winner : idx) {
				if (indeg[winner].size() == 0) {
					rank.add(winner);
					for (int loser : outdeg[winner]) {
						indeg[loser].remove(winner);
					}
					break;
				}
			}
			idx.remove(rank.peekLast());
		}
		rank.add(alt ? 1 : 0);
		for (int i : rank) {
			System.out.println(i);
		}
	}
}