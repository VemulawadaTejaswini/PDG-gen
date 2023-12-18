import java.util.*;

public class Main {
	private static int w, h;
	private static char[][] grid;
	private static int count;
	private static boolean valid;

	private static void dfs(int x, int y, int len) {
		if (x == w-1 && y == h-1) {
			if (len == count) valid = true;
			return;
		}
		if (x < w-1 && grid[y][x+1] == '#') {
			dfs(x+1, y, len + 1);
		}
		if (y < h-1 && grid[y+1][x] == '#') {
			dfs(x, y+1, len + 1);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		h = input.nextInt();
		w = input.nextInt();
		input.nextLine();
		grid = new char[h][];
		for (int y = 0; y < h; y++) {
			grid[y] = input.nextLine().toCharArray();
			for (int x = 0; x < w; x++) {
				if (grid[y][x] == '#') count++;
			}
		}
		if (grid[0][0] != '#') {
			System.out.println("Impossible");
			return;
		}
		valid = false;
		dfs(0, 0, 1);
		System.out.println(valid ? "Possible" : "Impossible");
	}
}
