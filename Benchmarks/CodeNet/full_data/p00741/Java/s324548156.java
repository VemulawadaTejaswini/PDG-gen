import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		while (true) {
			String[] ss = scr.nextLine().split(" ", 0);
			stage_size = new int[2];
			stage_size[0] = Integer.parseInt(ss[0]);
			stage_size[1] = Integer.parseInt(ss[1]);
			if (stage_size[0] == 0)
				break;
			stage = new int[stage_size[0]][stage_size[1]];
			visited = new boolean[stage_size[0]][stage_size[1]];
			for (int y = 0; y < stage_size[1]; y++) {
				String[] data = scr.nextLine().split(" ", 0);
				for (int x = 0; x < data.length; x++) {
					stage[x][y] = Integer.parseInt(data[x]);
					visited[x][y] = false;
				}
			}
			System.out.println(Islands());
		}
		scr.close();
	}

	static int[] stage_size;
	static int[][] stage;
	static boolean[][] visited;

	private static int Islands() {
		int islands = 0;
		for (int x = 0; x < stage.length; x++) {
			for (int y = 0; y < stage[x].length; y++) {
				if (visited[x][y] || stage[x][y] == 0)
					continue;
				else {
					Visit(x, y);
					islands++;
				}
			}
		}
		return islands;
	}

	private static void Visit(int x, int y) {
		if (x >= stage.length || y >= stage[0].length || x < 0 || y < 0 || stage[x][y] == 0 ||visited[x][y])
			return;
		if (stage[x][y] == 1) {
			visited[x][y] = true;
			Visit(x + 1, y);
			Visit(x, y + 1);
			Visit(x + 1, y + 1);
			Visit(x + 1, y - 1);
			Visit(x - 1, y);
			Visit(x, y - 1);
			Visit(x - 1, y + 1);
			Visit(x - 1, y - 1);
		}
	}
}