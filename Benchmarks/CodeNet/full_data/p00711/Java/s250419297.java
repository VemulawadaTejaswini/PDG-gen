import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0) {
				break;
			}
			int m = scanner.nextInt();

			int[][] map = new int[m][n];
			Integer[] start = new Integer[2];
			int island = 1;
			for (int i = 0; i < map.length; i++) {
				String line = scanner.next();
				for (int j = 0; j < line.length(); j++) {
					char place = line.charAt(j);
					if (place == '.') {
						map[i][j] = 1;
					} else if (place == '@') {
						start[0] = i;
						start[1] = j;
					}
				}
			}

			Deque<Integer[]> deque = new ArrayDeque<>();
			deque.addFirst(start);
			while (deque.size() > 0) {
				Integer[] poll = deque.pollFirst();
				if (poll[0] > 0 && map[poll[0] - 1][poll[1]] == 1) {
					Integer[] push = { poll[0] - 1, poll[1] };
					deque.addFirst(push);
					map[poll[0] - 1][poll[1]] = 0;
					island++;
				}
				if (poll[0] < m - 1 && map[poll[0] + 1][poll[1]] == 1) {
					Integer[] push = { poll[0] + 1, poll[1] };
					deque.addFirst(push);
					map[poll[0] + 1][poll[1]] = 0;
					island++;
				}
				if (poll[1] > 0 && map[poll[0]][poll[1] - 1] == 1) {
					Integer[] push = { poll[0], poll[1] - 1 };
					deque.addFirst(push);
					map[poll[0]][poll[1] - 1] = 0;
					island++;
				}
				if (poll[1] < n - 1 && map[poll[0]][poll[1] + 1] == 1) {
					Integer[] push = { poll[0], poll[1] + 1 };
					deque.addFirst(push);
					map[poll[0]][poll[1] + 1] = 0;
					island++;
				}
			}

			System.out.println(island);

		}
	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

	static char nextChar() {
		try {
			int b = System.in.read();
			while (b != -1 && (b == ' ' || b == '\r' || b == '\n'))
				;
			if (b == -1)
				return 0;
			return (char) b;
		} catch (IOException e) {
		}
		return 0;
	}

}