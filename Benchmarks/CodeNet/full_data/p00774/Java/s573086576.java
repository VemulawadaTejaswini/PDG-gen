import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Chain Disappearance Puzzle
 */
public class Main {

	public static int W = 5;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int H = parseInt(line);
			if (H == 0) break;

			// init
			List<Integer>[] board = new ArrayList[W];

			for (int i = 0; i < W; i++) {
				board[i] = new ArrayList<>();
			}

			for (int i = 0; i < H; i++) {
				String[] words = br.readLine().split(" ");
				for (int j = 0; j < W; j++) {
					board[j].add(0, parseInt(words[j]));
				}
			}

			// solve
			int point = 0;
			boolean hasNext = true;

			while (hasNext) {

				hasNext = false;

				// chain
				for (int i = 0; i < H; i++) {
					int min = W, max = -1, stone = 0;
					for (int j = 1; j <= 3; j++) {
						if (board[j].get(i) != 0
								&& board[j].get(i) == board[j - 1].get(i)
								&& board[j].get(i) == board[j + 1].get(i)) {
							min = Math.min(min, j - 1);
							max = Math.max(max, j + 1);
							stone = board[j].get(i);
							hasNext = true;
						}
					}
					if (max - min >= 2) point += stone * (max - min + 1);
					for (int j = min; j <= max; j++) board[j].set(i, 0);
				}
				// drop down
				for (int i = 0; i < W; i++) {
					board[i].removeIf(x -> x == 0);
					while (board[i].size() < H) {
						board[i].add(0);
					}
				}
			}

			System.out.println(point);

		} //end while
	} //end main
}