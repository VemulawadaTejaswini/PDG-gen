import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n = sc.nextInt();
		char[][] baggage = new char[50][50];
		int[][] r = new int[26][26];
		int[] d = new int[26];
		Z:for (int z = 0; z < n; z++) {
			int h = sc.nextInt(), w = sc.nextInt();
			for (int i = 0; i < h; i++) {
				String s = sc.next();
				for (int j = 0; j < w; j++)
					baggage[i][j] = s.charAt(j);
			}
			
			for (int i = 0; i < 26; i++)
				Arrays.fill(r[i], 0);
			
			char t = '.';
			for (char c = 'A'; c <= 'Z'; c++) {
				int minx, miny, maxx, maxy;
				maxx = maxy = -1;
				minx = miny = 100;
				for (int i = 0; i < h; i++) {
					for (int j = 0; j < w; j++) {
						if (baggage[i][j] == c) {
							minx = Math.min(minx, j);
							miny = Math.min(miny, i);
							maxx = Math.max(maxx, j);
							maxy = Math.max(maxy, i);
						}
					}
				}
				
				if (maxx >= 0) {
					for (int i = miny; i <= maxy; i++) {
						for (int j = minx; j <= maxx; j++) {
							if (baggage[i][j] == '.') {
								out.println("SUSPICIOUS");
								continue Z;
							} else if (baggage[i][j] != c) {
								r[c-'A'][baggage[i][j]-'A'] = -1;
								t = c;
							}
						}
					}
				}
			}
			
			if (t == '.') out.println("SAFE");
			else {
//				for (int i = 0; i < 26; i++) {
//					for (int j = 0; j < 26; j++) {
//						out.printf("%2d ", r[i][j]);
//					}
//					out.println();
//				}
				Arrays.fill(d, 0);
				for (int i = 0; i < 26; i++) {
					for (int j = 0; j < 26; j++) {
						for (int k = 0; k < 26; k++) {
							if (r[j][k] < 0) {
								if (d[j] + r[j][k] < d[k]) {
									d[k] = d[j] + r[j][k];
									
									if (i == 25) {
										out.println("SUSPICIOUS");
										continue Z;
									}
								}
							}
						}
					}
				}
				out.println("SAFE");
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}