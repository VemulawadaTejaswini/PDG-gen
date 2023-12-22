import java.util.Scanner;

public class Main {
	static class Pos {
		int x, y;

		Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static int f(Pos a1, Pos a2, Pos x, Pos y) {
		Pos da = new Pos(a2.x - a1.x, a2.y - a1.y);
		Pos dx = new Pos(x.x - a1.x, x.y - a1.y);
		Pos dy = new Pos(y.x - a1.x, y.y - a1.y);

		int kx = da.x * dx.y - da.y * dx.x;
		int ky = da.x * dy.y - da.y * dy.x;

		return kx * ky;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		Pos pos[] = new Pos[5];

		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				pos[j] = new Pos(sc.nextInt(), sc.nextInt());
			}

			boolean flag[] = {true, true};
			for (int j = 3; j <= 4; j++) {
				for (int k = 0; k < 3; k++) {
					if (f(pos[k], pos[(k + 1) % 3], pos[(k + 2) % 3], pos[j]) <= 0) {
						flag[j - 3] = false;
					}
				}
			}
			if (flag[0] != flag[1]) {
				System.out.println("OK");
			} else {
				System.out.println("NG");
			}
		}
	}
}