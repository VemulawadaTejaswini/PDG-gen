import java.util.*;
import java.math.*;
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.next());
		int m = Integer.parseInt(in.next());
		int x = Integer.parseInt(in.next()) - 1;
		int y = Integer.parseInt(in.next()) - 1;
		int xx = Integer.parseInt(in.next()) - 1;
		int yy = Integer.parseInt(in.next()) - 1;
		char[][] grid = new char[n][m];
		Node[][] nodes = new Node[n][m];
		int[][] seen = new int[n][m];
		List<Node> queue = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String cur = in.next();
			grid[i] = cur.toCharArray();
		}
		seen[x][y] = 1;
		dfs(grid, seen, x, y, n, m);
		if((grid[x][y] == '#') || (grid[xx][yy] == '#')) {
			System.out.println("-1");
		}else if(seen[xx][yy] == 1) {
			System.out.println(0);
		}else {
			queue.add(new Node(xx, yy, 0));
			int cnt = 0;
			int ans = -1;
			main:
			while(cnt < queue.size()) {
				int a = queue.get(cnt).x;
				int b = queue.get(cnt).y;
				for(int i = Math.max(0, a - 2); i <= Math.min(n - 1, a + 2); i++) {
					for(int j = Math.max(0, b - 2); j <= Math.min(m - 1, b + 2); j++) {
						if(grid[i][j] == '#') continue;
						if(seen[i][j] == 2) continue;
						if(seen[i][j] == 0) {
							seen[i][j] = 2;
							queue.add(new Node(i, j, queue.get(cnt).time + 1));
						}else {
							ans = queue.get(cnt).time + 1;
							break main;
						}
					}
				}
				cnt += 1;
			}
			System.out.println(ans);
		}
	}
	public static void dfs(char[][] grid, int[][] seen, int i, int j, int n, int m) {
		int[] a = {1, -1, 0, 0};
		int[] b = {0, 0, 1, -1};
		for(int k = 0; k < 4; k++) {
			int x = i + a[k];
			int y = j + b[k];
			if((x < 0) || (x >= n)) continue;
			if((y < 0) || (y >= m)) continue;
			if(seen[x][y] == 1) continue;
			if(grid[x][y] == '#') continue;
			seen[x][y] = 1;
			dfs(grid, seen, x, y, n, m);
		}
	}
}
class Node {
	int x;
	int y;
	int time;
	public Node(int x, int y, int time) {
		this.x = x;
		this.y = y;
		this.time = time;
	}
}