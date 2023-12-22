package net.dolpen.cp.contest.aoj0;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
	static char[][] c;

	static int[][] m = new int[][] {
			{ 0, 1 },
			{ 1, 0 },
			{ 0, -1 },
			{ -1, 0 }
	};

	static boolean isbomb(int x, int y) {
		if (x < 0 || y < 0 || x > 7 || y > 7)
			return false;
		return c[y][x] == '1';
	}

	static void bfs(int x, int y) {
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		ad.addLast(y * 8 + x);
		c[y][x] = 0;
		c[y][x] = '0';
		while (!ad.isEmpty()) {
			int n = ad.pollFirst();
			int nx = n % 8;
			int ny = n / 8;
			for (int i = 0; i < 4; i++)
				for (int j = 1; j <= 3; j++)
					if (isbomb(nx + j * m[i][0], ny + j * m[i][1])) {
						c[ny + j * m[i][1]][nx + j * m[i][0]] = '0';
						ad.addLast((ny + j * m[i][1]) * 8 + nx + j * m[i][0]);
					}
		}
	}

	public static void main(String[] args) throws Exception {
		c = new char[8][8];
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		for (int i = 1; i <= n; i++) {
			bf.readLine();
			for (int j = 0; j < 8; j++) {
				c[j] = bf.readLine().toCharArray();
			}
			int x = Integer.parseInt(bf.readLine());
			int y = Integer.parseInt(bf.readLine());
			bfs(x - 1, y - 1);
			System.out.println("Data " + i + ":");
			for (int j = 0; j < 8; j++) {
				System.out.println(new String(c[j]));
			}
		}
	}
}