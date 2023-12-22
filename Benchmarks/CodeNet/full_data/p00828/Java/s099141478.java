import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, M;
	static int[][][] f;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			M = sc.nextInt();
			int P = sc.nextInt();
			f = new int[N][N][N];
			int[][] h = new int[N][N];
			int win = 0;
			int turn = 0;
			int hand = 1;
			for (int i = 0; i < P; ++i, hand *= -1) {
				int xp = sc.nextInt() - 1;
				int yp = sc.nextInt() - 1;
				if (win != 0) continue;
				f[xp][yp][h[xp][yp]++] = hand;
				if (check(hand)) {
					win = hand;
					turn = i + 1;
				}
			}
			if (win == 1) {
				System.out.println("Black " + turn);
			} else if (win == -1) {
				System.out.println("White " + turn);
			} else {
				System.out.println("Draw");
			}
		}
	}

	static boolean check(int hand) {
		for (int x = 0; x < N; ++x) {
			for (int y = 0; y < N; ++y) {
				for (int z = 0; z < N; ++z) {
					if (f[x][y][z] != hand) continue;
					for (int dx = -1; dx <= 1; ++dx) {
						for (int dy = -1; dy <= 1; ++dy) {
							for (int dz = -1; dz <= 1; ++dz) {
								if (dx == 0 && dy == 0 && dz == 0) continue;
								boolean ok = true;
								int cx = x;
								int cy = y;
								int cz = z;
								for (int i = 0; i < M; ++i) {
									if (!inside(cx) || !inside(cy) || !inside(cz)) {
										ok = false;
										break;
									}
									if (f[cx][cy][cz] != hand) {
										ok = false;
										break;
									}
									cx += dx;
									cy += dy;
									cz += dz;
								}
								if (ok) return true;
							}
						}
					}
				}
			}
		}
		return false;
	}

	static boolean inside(int v) {
		return 0 <= v && v < N;
	}

}