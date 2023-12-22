import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Seven Puzzle
 */
public class Main {

	static int SIZE = 8;
	static final int[][] SWAP = {
			{1, 4},     //0
			{0, 2, 5},  //1
			{1, 3, 6},  //2
			{2, 7},     //3
			{0, 5},     //4
			{1, 4, 6},  //5
			{2, 5, 7},  //6
			{3, 6},     //7
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		Map<Integer, Integer> moves = new HashMap<>();
		Deque<int[][]> que = new ArrayDeque<>();
		int[] puzzle = {0, 1, 2, 3, 4, 5, 6, 7};

		que.offer(new int[][]{puzzle, {0}, {0}});
		moves.put(a2i(puzzle), 0);

		while (!que.isEmpty()) {
			int[][] s = que.poll();
			for (int i = 0; i < SWAP[s[1][0]].length; i++) {
				int[] t = new int[SIZE];
				System.arraycopy(s[0], 0, t, 0, SIZE);
				//swap
				t[s[1][0]] = t[SWAP[s[1][0]][i]];
				t[SWAP[s[1][0]][i]] = 0;
				if (!moves.containsKey(a2i(t))) {
					que.offer(new int[][]{t, {SWAP[s[1][0]][i]}, {s[2][0] + 1}});
					moves.put(a2i(t), s[2][0] + 1);
				}
			}
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			System.out.println(moves.get(s2i(line)));
		}
	}

	static int a2i(int[] a) {
		int ret = 0;
		for (int i = 0; i < SIZE; i++) {
			ret *= 10;
			ret += a[i];
		}
		return ret;
	}

	static int s2i(String s) {
		int ret = 0;
		for (int i = 0; i < s.length(); i += 2) {
			ret *= 10;
			ret += s.charAt(i) - '0';
		}
		return ret;
	}
}