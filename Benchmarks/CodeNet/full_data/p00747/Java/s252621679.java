import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main{

	public static String[][] maze;
	public static boolean[][] visit;
	public static int width;
	public static int height;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			String[] str = s.nextLine().split(" ");
			if (Integer.parseInt(str[0]) == 0 && Integer.parseInt(str[1]) == 0)
				break;
			width = Integer.parseInt(str[0]);
			height = Integer.parseInt(str[1]);
			maze = new String[2 * width - 1][2 * height - 1];
			visit = new boolean[2 * width - 1][2 * height - 1];
			for (int i = 0; i < (2 * height - 1); i++) {
				String line = s.nextLine();
				for (int j = 0; j < line.length(); j++) {
					String c = line.substring(j, j + 1);
					if (c != " ")
						maze[j][i] = c;
					else
						maze[j][i] = "";
				}
			}
			System.out.println(solve());
		}
	}

	public static int solve() {
		Queue<int[]> queue = new ArrayDeque<int[]>();
		int[] a = new int[3];
		queue.add(a);
		visit[0][0] = true;
		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			if (current[0] == 2 * width - 2 && current[1] == 2 * height - 2)
				return ++current[2];
			if (current[0] < 2 * width - 2) {
				if (Integer.parseInt(maze[current[0] + 1][current[1]]) != 1
						&& !visit[current[0] + 2][current[1]]) {
					int[] p = new int[3];
					p[0] = current[0] + 2;
					p[1] = current[1];
					p[2] = current[2] + 1;
					queue.add(p);
					visit[current[0] + 2][current[1]] = true;
				}
			}
			if (current[1] < 2 * height - 2) {
				if (Integer.parseInt(maze[current[0]][current[1] + 1]) != 1
						&& !visit[current[0]][current[1] + 2]) {
					int[] p = new int[3];
					p[0] = current[0];
					p[1] = current[1] + 2;
					p[2] = current[2] + 1;
					queue.add(p);
					visit[current[0]][current[1] + 2] = true;
				}
			}
			if (current[1] > 0) {
				if (Integer.parseInt(maze[current[0]][current[1] - 1]) != 1
						&& !visit[current[0]][current[1] - 2]) {
					int[] p = new int[3];
					p[0] = current[0];
					p[1] = current[1] - 2;
					p[2] = current[2] + 1;
					queue.add(p);
					visit[current[0]][current[1] - 2] = true;
				}
			}
			if (current[0] > 0) {
				if (Integer.parseInt(maze[current[0]-1][current[1]]) != 1
						&& !visit[current[0]-2][current[1]]) {
					int[] p = new int[3];
					p[0] = current[0] - 2;
					p[1] = current[1];
					p[2] = current[2] + 1;
					queue.add(p);
					visit[current[0] - 2][current[1]] = true;
				}
			}
		}
		return 0;
	}
}