//package aoj2253;

import java.util.*;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static Queue<Integer> queueX = new ArrayDeque<Integer>();
	static Queue<Integer> queueY = new ArrayDeque<Integer>();

	static int[][] field = new int[100][100];
	static int count;
	static int ans;

	public static void main (String[] args) {
		while (scan.hasNext()) {
			int t = scan.nextInt();
			int n = scan.nextInt();
			for (int i = 0; i < 100; i++) {
				Arrays.fill(field[i], 0);
			}
			if (t != 0 || n != 0) {
				solve(t, n);
			}
			while (queueX.poll() != null);
			while (queueY.poll() != null);
		}
	}

	static void solve(int turn, int n) {

		for (int i = 0; i < n; i++) {
			int tmpX = scan.nextInt();
			int tmpY = scan.nextInt();
			field[tmpX + 50][tmpY + 50] = -1;
		}

		queueX.add(scan.nextInt() + 50);
		queueY.add(scan.nextInt() + 50);
		field[queueX.element()][queueY.element()] = 1;

		count = 1;
		ans = 1;
		for (int i = 0; i < turn; i++) {
			count = bfs(count);
			//System.out.println(count);
		}

		System.out.println(ans);

	}

	static int bfs(int count) {
		int cnt = 0;
		for (int j = 0; j < count; j++) {
			if (queueX.peek() != null) {
				int posX = queueX.poll();
				int posY = queueY.poll();
				int VectorX[] = {-1, 0, 1, 1, 0, -1};
				int VectorY[] = {0, 1, 1, 0, -1, -1};
				for (int i = 0; i < 6; i++) {
					if (field[posX + VectorX[i] ][posY + VectorY[i] ] == 0) {
						field[posX + VectorX[i] ][posY + VectorY[i] ] = 1;
						queueX.add(posX + VectorX[i]);
						queueY.add(posY + VectorY[i]);	
						ans++;
						cnt++;
					/*	System.out.print(posX + VectorX[i]+" ");
						System.out.println(posY + VectorY[i]);		*/
					}
				}
			}
		}
		return cnt;
	}
}