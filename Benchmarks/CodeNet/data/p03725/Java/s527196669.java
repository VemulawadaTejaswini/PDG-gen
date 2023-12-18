import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) throws Exception {

		int h;
		int w;
		int k;

		String[][] map1;
		int[][] map2;

		int px = -1;
		int py = -1;

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String line;

			line = br.readLine();
			{
				String[] tokens = line.split(" ");
				h = Integer.parseInt(tokens[0]);
				w = Integer.parseInt(tokens[1]);
				k = Integer.parseInt(tokens[2]);
			}

			map1 = new String[h][w];
			map2 = new int[h][w];

			int r = 0;
			while ((line = br.readLine()) != null) {
				String[] tokens = line.split("");

				for (int i = 0; i < w; i++) {
					map1[r][i] = tokens[i + 1];
					map2[r][i] = Integer.MAX_VALUE;
					if (map1[r][i].equals("S")) {
						px = r;
						py = i;
					}
				}

				r++;
			}
		}

		map2[px][py] = 0;
		int count  = 0;

		Loop1:
		while(true) {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					//if (count == map2[i][j]) {
						for (int i2 = -k; i2 <= k; i2++) {
							for (int j2 = -k; Math.abs(j2) + Math.abs(i2) <= k; j2++) {
								if (i + i2 < h && j + j2 < w && 0 <= i + i2 && 0 <= j + j2 && ".".equals(map1[i + i2][j + j2])) {
									if (i + i2 == 0 || i + i2 == h - 1 ||
										j + j2 == 0 || j + j2 == w -1) {
										count++;
										break Loop1;
									}
									if (map2[i + i2][j + j2] > count + 1) {
										map2[i + i2][j + j2] = count + 1;
									}
								}
							}
						}
					//}
				}
			}

			count++;

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (count == map2[i][j] || count - 1 == map2[i][j]) {
						for (int i2 = -k; i2 <= k; i2++) {
							for (int j2 = -k; Math.abs(j2) + Math.abs(i2) <= k; j2++) {
								if (i + i2 < h && j + j2 < w && 0 <= i + i2 && 0 <= j + j2 && "#".equals(map1[i + i2][j + j2])) {
									if ("#".equals(map1[i + i2][j + j2])) {
										map1[i + i2][j + j2] = ".";
									}
								}
							}
						}
					}
				}
			}
		}

		System.out.println(count);
	}
}