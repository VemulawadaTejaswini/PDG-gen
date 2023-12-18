import java.util.Scanner;

public class Main {
	static int H, W;
	static char[][] s;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};

	static boolean check(int i, int j) {
		for (int k = 0; k < 4; k++) {
			int i2 = i + dx[k];
			int j2 = j + dy[k];
			if(0 <= i2 && i2 < H && 0 <= j2 && j2 < W && s[i2][j2] == '#') return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		s = new char[H][W];
		for (int i = 0; i < H; i++) {
			s[i] = sc.next().toCharArray();
		}

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if(s[i][j] == '.') continue;
				if(s[i][j] == '#') {
					if(!check(i, j)) {
						System.out.println("No");
						return;
					}
				}
			}
		}

		System.out.println("Yes");
	}
}