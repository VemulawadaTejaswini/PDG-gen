import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int w = s.nextInt(), h = s.nextInt(), n = s.nextInt();
		
		boolean[][] white = new boolean[h][w];
		for (int i = 0; i < white.length; i++) {
			Arrays.fill(white[i], true);
		}
		for (int i = 0; i < n; i++) {
			int x = s.nextInt(), y = s.nextInt(), a = s. nextInt();
			if (a==1) {
				for (int j = 0; j < h; j++) {
					for (int k = 0; k < x; k++) {
						white[j][k] = false;
					}
				}
			}else if (a==2) {
				for (int j = 0; j < h; j++) {
					for (int k = x; k < w; k++) {
						white[j][k] = false;
					}
				}
			}else if (a==3) {
				for (int j = 0; j < y; j++) {
					for (int k = 0; k < w; k++) {
						white[j][k] = false;
					}
				}
			}else if (a==4) {
				for (int j = y; j < h; j++) {
					for (int k = 0; k < w; k++) {
						white[j][k] = false;
					}
				}
			}
		}
		
		
		int ans = 0;
		for (int i = 0; i < white.length; i++) {
			for (int j = 0; j < white[i].length; j++) {
				if (white[i][j]) {
					ans++;
				}
			}
		}
		System.out.println(ans);
		s.close();
	}
}
