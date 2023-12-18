import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] s = new char[H][W];
		
		for (int i = 0; i < H; i++) {
			String tmp = sc.next();
			for (int j = 0; j < W; j++) {
				s[i][j] = tmp.charAt(j);
			}
		}
		
		int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
		int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (s[i][j] == '#') {
					System.out.print(s[i][j]);
				} else {
					int sum = 0;
					for (int k = 0; k < 8; k++) {
						int tmpX = j + dx[k];
						int tmpY = i + dy[k];
						if (0 < tmpX || tmpX > W) continue;
						if (0 < tmpY || tmpY > H) continue;
						
						if (s[tmpY][tmpX] == '#') {
							sum++;
						}
					}
					System.out.print(sum);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
