import java.util.*;

public class Main {

	static int w, h;
	static int ans = -1;
	static char[][] op;
	static boolean[][] check;
	static Set<String> set = new HashSet<String>();

	public static int[] getNext (int y, int x, int vector) {
		if (vector == 1) {
			x = x == 0 ? w - 1 : x - 1;
		} else if (vector == 2) {
			x = (x + 1) % w;
		} else if (vector == 3) {
			y = y == 0 ? h - 1 : y - 1;
		} else if (vector == 4) {
			y = (y + 1) % h;
		}
		return new int[]{y,x};
	}

	public static void dfs (int y, int x, int memory, int vector) {

		if (op[y][x] == '<') {
			vector = 1;
		} else if (op[y][x] == '>') {
			vector = 2;
		} else if (op[y][x] == '^') {
			vector = 3;
		} else if (op[y][x] == 'v') {
			vector = 4;
		} else if (op[y][x] == '_') {
			vector = memory == 0 ? 2 : 1;
		} else if (op[y][x] == '|') {
			vector = memory == 0 ? 4 : 3;
		} else if (op[y][x] == '@') {
			ans = 1;
			return;
		} else if ('0' <= op[y][x] && op[y][x] <= '9') {
			memory = op[y][x] - '0';
		} else if (op[y][x] == '+') {
			memory = (memory + 1) % 16;
		} else if (op[y][x] == '-') {
			memory = (memory - 1) % 16;
		}

		if (op[y][x] == '?') {
			for (int i = 1; i <= 4; i++) {
				int[] next = getNext(y,x,i);
				String str = next[0] + " " + next[1] + " " + memory + " " + i;
				if (!set.contains(str)) {
					set.add(str);
				} else if (check[next[0]][next[1]]) {
					continue;
				}
				dfs(next[0],next[1],memory,i);
			}
		} else {
			int[] next = getNext(y,x,vector);
			String str = next[0] + " " + next[1] + " " + memory + " " + vector;
			if (!set.contains(str)) {
				set.add(str);
				dfs(next[0],next[1],memory,vector);
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		h = sc.nextInt();
		w = sc.nextInt();
		op = new char[h][w];
		check = new boolean[h][w];

		sc.nextLine();

		for (int i = 0; i < h; i++) {
			op[i] = sc.nextLine().toCharArray();
		}
		dfs(0,0,0,2);
		System.out.println(ans == 1 ? "YES" : "NO");

	}
}