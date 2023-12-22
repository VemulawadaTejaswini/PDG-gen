import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Integer.parseInt;

/**
 * The Shortest Path on A Rhombic Path
 */
public class Main {

	public static int MAX = 100;
	public static int[] H = {0, 1};
	public static int[] V = {1, 0};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int[][] rhombus = new int[MAX][MAX];

		int prevLen = 0, maxLen = 0;
		while ((line = br.readLine()) != null && !line.isEmpty()) {

			String[] words = line.split(",");

			if (words.length > prevLen) {
				for (int i = 0, c = 0, r = words.length - 1; i < words.length; i++, c++, r--) {
					rhombus[r][c] = parseInt(words[i]);
				}
			} else {
				for (int i = 0, c = maxLen - words.length, r = maxLen - 1; i < words.length; i++, c++, r--) {
					rhombus[r][c] = parseInt(words[i]);
				}
			}

			prevLen = words.length;
			maxLen = Math.max(maxLen, words.length);

		}

		int maxSum = 0;
		Deque<int[]> queue = new ArrayDeque<>();
		queue.offer(new int[]{0, 0, rhombus[0][0]});    //[row,col,count]
		
		while (!queue.isEmpty()) {

			int[] prev = queue.poll();

			if (prev[0] == maxLen - 1 && prev[1] == maxLen - 1) {
				maxSum = Math.max(maxSum, prev[2]);
				continue;
			}

			for (int i = 0; i < H.length; i++) {

				int nextR = prev[0] + H[i];
				int nextC = prev[1] + V[i];

				if (nextR < maxLen && nextC < maxLen) {
					queue.offer(new int[]{nextR, nextC, prev[2] + rhombus[nextR][nextC]});
				}

			}
		}
		System.out.println(maxSum);

	}

}