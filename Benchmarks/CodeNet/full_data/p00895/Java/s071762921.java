import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
	int h, w;
	char[][] map;
	boolean[][] visited;
	int[] dirx = {-1, 0, 1, -1, 1, -1, 0, 1};
	int[] diry = {-1, -1, -1, 0, 0, 1, 1, 1};
	HashSet<String> hash = new HashSet<String>();
	String ans;
	
	public void run() {
		while (true) {
			h = in.nextInt();
			w = in.nextInt();
			if ((h|w) == 0) break;
			map = new char[h][w];
			visited = new boolean[h][w];
			hash.clear();
			ans = "";
			for (int i = 0; i < h; i++) {
				String s = in.next();
				for (int j = 0; j < w; j++) {
					map[i][j] = s.charAt(j);
				}
			}
			
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					for (int k = 0; k < 8; k++) {
						int x = j, y = i;
						String s = map[y][x] + "";
						for (int l = 0; l < visited.length; l++)
							Arrays.fill(visited[l], false);
						visited[i][j] = true;
						for ( ; ; ) {
							x = (x + dirx[k] + w) % w;
							y = (y + diry[k] + h) % h;
							s += map[y][x];
							if (!visited[y][x]) {
								if (hash.contains(s)) {
									if (s.length() > ans.length() || (s.length() == ans.length() && s.compareTo(ans) < 0)) {
										ans = s.toString();
									}
								} else {
									hash.add(s);
								}
							} else
								break;
						}
						
					}
				}
			}
			
			if (ans.length() < 2)
				System.out.println(0);
			else
				System.out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}