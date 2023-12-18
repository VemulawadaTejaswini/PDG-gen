import java.awt.Point;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[] dw = { 1, 0, -1, 0 };
	static int[] dh = { 0, 1, 0, -1 };
	static int H;
	static int W;
	static int black;
	static int white;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		ArrayList<String> Sh = new ArrayList<>(450);
		for (int i = 0; i < H; i++) {
			Sh.add(sc.next());
		}
		Queue<Point> queue = new ArrayDeque<>();
		int[][] reached = new int[500][500];
		int ans = 0;
		for (int i = 0; i < W; i++) {
			for (int j = 0; j < H; j++) {
				black=0;
				white=0;
				if (Sh.get(j).charAt(i) == '#' && reached[j][i] == 0) {
					reached[j][i]++;
					black++;
					queue.offer(new Point(j, i));
					bfs(queue, Sh, reached);
//					System.out.println("black = " + black + "white = " + white);
					ans += black * white;
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}

	public static void bfs(Queue<Point> queue, ArrayList<String> S, int[][] reached) {
//		 System.out.println("BFS!! " + queue.peek());
		while (queue.peek() != null) {
			Point p = queue.poll();
			if (p == null) {
				return;
			}
//			 System.out.println("(" + p.x + "," + p.y + ")" + " = " + S.get(p.x).charAt(p.y));
			if (S.get(p.x).charAt(p.y) == '#') {
				for (int k = 0; k < 4; k++) {
					if (p.x + dh[k] > H - 1 || p.x + dh[k] < 0 || p.y + dw[k] > W - 1 || p.y + dw[k] < 0) {
						continue;
					}
					if (reached[p.x + dh[k]][p.y + dw[k]] > 0)
						continue;
					if (S.get(p.x + dh[k]).charAt(p.y + dw[k]) == '.') {
						queue.offer(new Point(p.x + dh[k], p.y + dw[k]));
						reached[p.x + dh[k]][p.y + dw[k]]++;
						white++;
					}
				}
			} else {
				for (int k = 0; k < 4; k++) {
					if (p.x + dh[k] > H - 1 || p.x + dh[k] < 0 || p.y + dw[k] > W - 1 || p.y + dw[k] < 0) {
						continue;
					}
					if (reached[p.x + dh[k]][p.y + dw[k]] > 0)
						continue;
					if (S.get(p.x + dh[k]).charAt(p.y + dw[k]) == '#') {
						queue.offer(new Point(p.x + dh[k], p.y + dw[k]));
						reached[p.x + dh[k]][p.y + dw[k]]++;
						black++;
					}
				}
			}
			bfs(queue,S,reached);
		}

	}
}
