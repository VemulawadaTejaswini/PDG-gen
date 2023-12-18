import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int count = 101 * 101;
		long[][] possibility = new long[101][101];

		int x = 0;
		int y = 0;
		long h = 0;
		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			h = sc.nextLong();
			// h = max(H - |x - cx| - |y - cy|, 0)
			// H = h + |x - cx| + |y - cy|
			for (int j = 0; j < 101; j++) {
				for (int k = 0; k < 101; k++) {
					if (possibility[j][k] == -1) continue;
					long H = h + Math.abs(x - j) + Math.abs(y - k);
					if (possibility[j][k] == 0 || possibility[j][k] == H) {
						possibility[j][k] = H;
						continue;
					}
					possibility[j][k] = -1;
					count--;
				}
			}
			if (count == 1) break;
		}

		for (int i = 0; i < possibility.length; i++) {
			for (int j = 0; j < possibility.length; j++) {
				if (possibility[i][j] > 0) {
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print(" ");
					System.out.println(h + Math.abs(x - i) + Math.abs(y - j));
					return;
				}
			}
		}
	}
}
