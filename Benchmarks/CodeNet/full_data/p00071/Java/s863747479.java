
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			int[][] map = new int[8][8];
			for (int j = 0; j < 8; j++) {
				String line = scanner.next();
				for (int k = 0; k < 8; k++) {
					if (line.charAt(k) == '1') {
						map[j][k] = 1;
					}
				}
			}
			int xbom = scanner.nextInt() - 1;
			int ybom = scanner.nextInt() - 1;

			bom(ybom, xbom, map);
			
			System.out.println(String.format("Data %d:", i));
			for(int j =0;j<8;j++){
				for(int k=0;k<8;k++){
					System.out.print(map[j][k]);
				}
				System.out.println();
			}
		}
	}

	private static void bom(int y, int x, int[][] map) {
		if (y < 0 || 8 <= y || x < 0 || 8 <= x || map[y][x] == 0) {
			return;
		}
		int[] py = { -3, -2, -1, 0, 0, 0, 0, 0, 0, 1, 2, 3 };
		int[] px = { 0, 0, 0, -3, - 2, -1, 1, 2, 3, 0, 0, 0 };
		map[y][x] = 0;
		for (int i = 0; i < 12; i++) {
			int ny = y + py[i];
			int nx = x + px[i];
			bom(ny, nx, map);
		}

	}
}