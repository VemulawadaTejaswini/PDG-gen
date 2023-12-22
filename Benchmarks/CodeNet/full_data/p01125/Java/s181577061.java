import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n, m;
		boolean[][] map = new boolean[21][21];
		int x, y;
		W:while (true) {
			n = sc.nextInt();
			if (n == 0) break;
			for (int i = 0; i < 21; i++)
				Arrays.fill(map[i], false);
			
			for (int i = 0; i < n; i++)
				map[sc.nextInt()][sc.nextInt()] = true;
			
			m = sc.nextInt();
			x = y = 10;
			for (int i = 0; i < m; i++) {
				String s = sc.next();
				int d = sc.nextInt();
				if (s.equals("N")) {
					for (int j = 0; j < d; j++)
						map[x][++y] = false;
				} else if (s.equals("E")) {
					for (int j = 0; j < d; j++)
						map[++x][y] = false;
				} else if (s.equals("W")) {
					for (int j = 0; j < d; j++)
						map[--x][y] = false;
				} else if (s.equals("S")) {
					for (int j = 0; j < d; j++)
						map[x][--y] = false;
				}
			}
			for (int i = 0; i < 21; i++) {
				for (int j = 0; j < 21; j++) {
					if (map[i][j]) {
						out.println("No");
						continue W;
					}
				}
			}
			out.println("Yes");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}