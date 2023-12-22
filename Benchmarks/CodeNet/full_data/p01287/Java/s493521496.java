import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[][] trans = { 
		{ 0, 1, 2, 3, 4, 5, 6, 7 },
		{ 4, 7, 6, 5, 0, 3, 2, 1 },
		{ 0, 4, 5, 1, 3, 7, 6, 2 },
		{ 1, 5, 6, 2, 0, 4, 7, 3 },
		{ 2, 6, 7, 3, 1, 5, 4, 0 },
		{ 3, 7, 4, 0, 2, 6, 5, 1 },
	};
	static int[] C = new int[8];
	static int[] color = new int[8];
	static ArrayList<Oct> octs;

	public static void main(String[] args) {
		while (sc.hasNext()) {
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for (int i = 0; i < 8; ++i) {
				String c = sc.next();
				if (!map.containsKey(c)) {
					map.put(c, map.size());
				}
				C[i] = map.get(c);
			}
			octs = new ArrayList<Oct>();
			color[0] = C[0];
			boolean[] used = new boolean[8];
			used[0] = true;
			dfs(1, color, used);
			System.out.println(octs.size());
		}
	}

	static void dfs(int pos, int[] color, boolean[] used) {
		if (pos == 8) {
			if (check(color)) {
				octs.add(new Oct(color));
			}
			return;
		}
		for (int i = 1; i < 8; ++i) {
			if (used[i]) continue;
			color[pos] = C[i];
			used[i] = true;
			dfs(pos + 1, color, used);
			used[i] = false;
		}
	}

	static boolean check(int[] color) {
		int[] c = new int[8];
		for (int i = 0; i < 6; ++i) {
			for (int j = 0; j < 8; ++j) {
				c[j] = color[trans[i][j]];
			}
			for (int j = 0; j < 4; ++j) {
				rot(c);
				for (Oct o : octs) {
					if (Arrays.equals(o.c, c)) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	static void rot(int[] color) {
		for (int i = 0; i < 2; ++i) {
			int tmp = color[i * 4 + 0];
			color[i * 4 + 0] = color[i * 4 + 1];
			color[i * 4 + 1] = color[i * 4 + 2];
			color[i * 4 + 2] = color[i * 4 + 3];
			color[i * 4 + 3] = tmp;
		}
	} 
	
	static class Oct {
		int[] c;

		Oct(int[] c) {
			this.c = c.clone();
		}
	}

}