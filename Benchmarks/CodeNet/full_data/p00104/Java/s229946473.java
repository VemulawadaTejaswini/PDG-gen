import java.util.Scanner;

public class Main {

	public static void solve (String[] map) {
		int x = 0, y = 0;
		boolean[][] check = new boolean[map.length][map[0].length()];
		while (map[y].charAt(x) != '.') {
			if (check[y][x]) {
				System.out.println("LOOP");
				return;
			} else
				check[y][x] = true;
			char c = map[y].charAt(x);
			if (c == '^')
				y--;
			else if (c == 'v')
				y++;
			else if (c == '>')
				x++;
			else
				x--;
		}
		System.out.println(x + " " + y);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			String[] str = sc.nextLine().split(" ");
			int h = Integer.parseInt(str[0]);
			int w = Integer.parseInt(str[1]);
			if (w == 0 && h == 0) break;
			String[] map = new String[h];
			for (int i = 0; i < h; i++) {
				map[i] = sc.nextLine();
			}
			solve(map);
		}

	}

}