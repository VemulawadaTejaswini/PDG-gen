import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Dessert Witch
 */
public class Main {

	static final int[][] DIR = {
			{1, 1},     //0
			{1, 0},     //1
			{1, -1},    //2
			{0, 1},     //3
			{-1, -1},   //4
			{-1, 0},    //5
			{-1, 1},    //6
			{0, -1},    //7
	};

	static char[][] TABLE = new char[10][10];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		//String[] words;

		for (int i = 0; i < 10; i++) {
			Arrays.fill(TABLE[i], ' ');
		}

		for (int i = 1; i <= 8; i++) {
			line = br.readLine();
			for (int j = 0; j < 8; j++) {
				TABLE[i][j + 1] = line.charAt(j);
			}
		}

		//solve
		boolean hasNext = true;
		while (hasNext) {
			hasNext = false;
			hasNext |= Mami();
			hasNext |= Witch();
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				sb.append(TABLE[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb.toString());

	} //end main

	static boolean Mami() {

		List<int[]> list = search('o');


		if (!list.isEmpty()) {
			Collections.sort(list, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					if (o1[4] != o2[4]) {
						return Integer.compare(o2[4], o1[4]);
					} else {
						if (o1[0] != o2[0]) {
							return Integer.compare(o1[0], o2[0]);
						} else {
							return Integer.compare(o1[1], o2[1]);
						}
					}
				}
			});
			put('o', list);
			return true;
		} else {
			return false;
		}
	}

	static boolean Witch() {

		List<int[]> list = search('x');

		if (!list.isEmpty()) {
			Collections.sort(list, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					if (o1[4] != o2[4]) {
						return Integer.compare(o2[4], o1[4]);
					} else {
						if (o1[0] != o2[0]) {
							return Integer.compare(o2[0], o1[0]);
						} else {
							return Integer.compare(o2[1], o1[1]);
						}
					}
				}
			});
			put('x', list);
			return true;
		} else {
			return false;
		}
	}

	static List<int[]> search(char p) {

		char t;
		List<int[]> list = new ArrayList<>();

		if (p == 'o') t = 'x';
		else t = 'o';

		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				if (TABLE[i][j] == p) {
					for (int k = 0; k < 8; k++) {
						int y, x;
						y = i + DIR[k][0];
						x = j + DIR[k][1];
						int[] res = null;
						if (TABLE[y][x] == t) {
							res = searchS(t, y, x, k, 1);
							if (res != null) {
								list.add(res);
							}
						}
					}
				}
			}
		}

		//sum up
		if (list.size() > 1) {
			int[][] sum = new int[10][10];
			for (int[] l : list) {
				sum[l[0]][l[1]] += l[3];
			}
			for (int[] l : list) {
				l[4] = sum[l[0]][l[1]];
			}
		}
		return list;
	}

	static int[] searchS(char t, int y, int x, int dir, int c) {

		int ny, nx;
		ny = y + DIR[dir][0];
		nx = x + DIR[dir][1];

		if (TABLE[ny][nx] == t) {
			return searchS(t, ny, nx, dir, c + 1);
		} else if (TABLE[ny][nx] == '.') {
			return new int[]{ny, nx, dir, c, c};
		} else {
			return null;
		}
	}

	static void put(char p, List<int[]> list) {

		int sy, sx;
		sy = list.get(0)[0];
		sx = list.get(0)[1];

		TABLE[sy][sx] = p;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)[0] == sy && list.get(i)[1] == sx) {
				int y, x, dir, c;
				y = sy;
				x = sx;
				dir = (list.get(i)[2] + 4) % 8;
				c = list.get(i)[3];
				for (int j = 0; j < c; j++) {
					y += DIR[dir][0];
					x += DIR[dir][1];
					TABLE[y][x] = p;
				}
			} else {
				break;
			}
		}
	}
}