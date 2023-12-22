import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Party
 */
public class Main {

	static int count;
	static boolean[][] friends;
	static HashSet<Integer> invited;
	static LinkedList<Integer> queue;
	static int[] depth;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = Integer.parseInt(line);
			int m = Integer.parseInt(br.readLine());
			if ((n | m) == 0) {
				break;
			}

			friends = new boolean[n + 1][n + 1];
			invited = new HashSet<Integer>();
			queue = new LinkedList<Integer>();
			depth = new int[n + 1];

			int p, q;
			for (int i = 0; i < m; i++) {
				line = br.readLine();
				p = Integer.parseInt(line.substring(0, line.indexOf(' ')));
				q = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
				friends[p][q] = true;
			}
			count = 0;
			bfs(1, n);
			System.out.println(count);
		}
	}

	static void bfs(int s, int n) {
		queue.add(s);
		while (!queue.isEmpty()) {
			int f = queue.removeFirst();
			if (depth[f] < 2) {
				for (int i = 1; i < n + 1; i++) {
					if (friends[f][i]) {
						if (depth[i] == 0) {
							count++;
							depth[i] = depth[f] + 1;
							queue.add(i);
						}
					}
				}
			}
		}
	}
}