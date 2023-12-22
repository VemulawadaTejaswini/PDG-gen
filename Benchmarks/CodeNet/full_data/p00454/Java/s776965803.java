import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int h, w;
	static int[][] arr;

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		while(true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if(w==0&&h==0) break;
			int n = sc.nextInt();
			arr = new int[h + 1][w + 1];
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt(), y = sc.nextInt();
				int x2 = sc.nextInt(), y2 = sc.nextInt();
				arr[y][x]++;
				arr[y2][x2]++;
				arr[y][x2]--;
				arr[y2][x]--;
			}
			for (int i = 0; i <= h; i++) {
				for (int j = 1; j <= w; j++) {
					arr[i][j] += arr[i][j - 1];
				}
			}
			for (int i = 1; i <= h; i++) {
				for (int j = 0; j <= w; j++) {
					arr[i][j] += arr[i - 1][j];
				}
			}
			//show(arr);
			long count = 0L;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (arr[i][j] == 0) {
						count++;
						bfs(new Point(i, j));
					}
				}
			}
			System.out.println(count);
		}
	}

//	static void show(int[][] a) {
//		System.out.println("\nStart");
//		for (int[] aa : a) {
//			for (int i : aa) {
//				//System.out.print(i == 0 ? "■" : "□");
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//	}

	static void bfs(Point start) {
		ArrayDeque<Point> deq = new ArrayDeque<>();
		deq.offer(start);
		while (!deq.isEmpty()) {
			Point p = deq.poll();
			if(arr[p.x][p.y]!=0) {
				continue;
			}
			arr[p.x][p.y] = 1;
			for (int i = 0; i < 4; i++) {
				if (p.x + dy[i] < 0 || p.x + dy[i] >= h || p.y + dx[i] < 0 || p.y + dx[i] >= w) {
				} else {
					deq.offer(new Point(p.x + dy[i], p.y + dx[i]));
				}
			}
		}
	}
}

