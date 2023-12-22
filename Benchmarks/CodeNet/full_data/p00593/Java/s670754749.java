import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c_count = 1;
		while (true) {
			final int N = sc.nextInt();

			if (N == 0) {
				break;
			}

			int[][] map = new int[N][N];

			int count = 1;
			int x = 0, y = 0;
			int state = 0;
			map[0][0] = 1;
			count++;
			if (N != 1) {
				x++;
				
				while (count <= N * N) {
					

					if (state == 0) {
						for (; x >= 0 && y < N; x--, y++) {
							map[y][x] = count;
							count++;
						}
						x++;
						y--;
						

						if (y == N - 1) {
							x++;
						} else {
							y++;
						}
						state = 1;

					} else if (state == 1) {
						for (; y >= 0 && x < N; y--, x++) {
							map[y][x] = count;
							count++;
						}
						y++;
						x--;

						if (x == N - 1) {
							y++;
						} else {
							x++;
						}
						state = 0;
					}
				}
			}
			System.out.println("Case " + c_count + ":");
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.printf("%3d", map[i][j]);
				}
				System.out.println();
			}

			c_count++;
		}

	}

}