import java.io.*;
import java.util.*;

class RC {
	int r;
	int c;
	
	RC() {}
	
	RC(int r, int c) {
		this.r = r;
		this.c = c;
	}
}

class Solution {
	final int SIZE = 1000;
	int[] dr = { 0, 1, 0, -1 };
	int[] dc = { 1, 0, -1, 0 };
	int h, w, n;
	char[][] graph = new char[SIZE][];
	int[][] distance = new int[SIZE][SIZE];
	boolean[][] visit = new boolean[SIZE][SIZE];
	RC s = new RC();
	Queue<RC> que = new LinkedList<RC>();
	int chikara;
	int ans;

	void compute() {
		Scanner scanner = new Scanner(System.in);
		h = scanner.nextInt();
		w = scanner.nextInt();
		n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < h; i++) {
			graph[i] = scanner.nextLine().toCharArray();
			Arrays.fill(visit[i], false);
			for (int j = 0; j < w; j++) {
				if (graph[i][j] == 'S') {
					s.r = i;
					s.c = j;
				}
			}
		}
		chikara = 1;
		ans = 0;
		for (int i = 0; i < n; i++) {
			bfs();
			ans += distance[s.r][s.c];
			chikara++;
		}
		System.out.println(ans);
		scanner.close();
	}

	void bfs() {
		for (int i = 0; i < h; i++) {
			Arrays.fill(distance[i], -1);
		}
		que.clear();
		distance[s.r][s.c] = 0;
		que.add(s);
		while (!que.isEmpty()) {
			RC rc = que.poll();
			for (int i = 0; i < 4; i++) {
				RC nrc = new RC(rc.r + dr[i], rc.c + dc[i]);
				if (nrc.r >= 0 && nrc.r < h && nrc.c >= 0 && nrc.c < w && graph[nrc.r][nrc.c] != 'X' && distance[nrc.r][nrc.c] == -1) {
					distance[nrc.r][nrc.c] = distance[rc.r][rc.c] + 1;
					if (Character.isDigit(graph[nrc.r][nrc.c]) && graph[nrc.r][nrc.c] - '0' <= chikara && !visit[nrc.r][nrc.c]) {
						visit[nrc.r][nrc.c] = true;
						s = nrc;
						return;
					} else {
						que.add(nrc);
					}
				}
			}
		}
	}
	
	void debug() {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(distance[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}

public class Main {
	public static void main(String args[]) {
		Solution solution = new Solution();
		solution.compute();
	}
}
