import java.util.Scanner;

class Main{
	static int[] dh = {0, 0, 1, -1, -1, -1, 1, 1};
	static int[] dw = {-1, 1, 0, 0, -1, 1, -1, 1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(), W = sc.nextInt();
		char[][] map = new char[H][W];
		for(int i = 0; i < H; i++) {
			String S = sc.next();
			for(int j = 0; j < W; j++) {
				map[i][j] = S.charAt(j);
			}
		}
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(map[i][j] == '#') continue;
				int cnt = 0;
				for(int k = 0; k < 8; k++) {
					if(i + dh[k] < 0 || j + dw[k] < 0 || i + dh[k] >= H || j + dw[k] >= W) continue;
					if(map[i + dh[k]][j + dw[k]] == '#') cnt++;
				}
				map[i][j] = (char)('0' + cnt);
			}
		}
		for(int i = 0; i < H; i++) {
			System.out.println(String.valueOf(map[i]));
		}
	}
}