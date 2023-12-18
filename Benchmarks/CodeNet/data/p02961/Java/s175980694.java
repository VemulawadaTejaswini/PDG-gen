import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static boolean xFlg, yFlg, swap;
	static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		if (x < 0) {
			x *= -1;
			xFlg = true;
		}
		if (y < 0) {
			y *= -1;
			yFlg = true;
		}
		if (x > y) {
			int t = x;
			x = y;
			y = t;
			swap = true;
		}
		int z = x + y;
		if (k % 2 == 0 && z % 2 == 1) {
			System.out.println(-1);
			return;
		}

		int ans = 1;
		if (z != k) {
			ans = (z + k - 1) / k;
			if (ans == 1) {
				ans = 2;
			}
			if (ans % 2 == 0 && z % 2 == 1) {
				ans++;
			}
		}
		pw.println(ans);

		if (ans == 3) {
			int x1 = k - y;
			print(x1, y);
			int x2 = (x + x1) / 2;
			print(x2, y + k - (x1 - x2));
			print(x, y);
		} else {
			int total = k * ans;
			int over = (total - z) / 2;
			int sum = 0;
			int x2 = 0;
			int y2 = 0;
			while (sum < total) {
				sum += k;
				if (sum <= x + over) {
					x2 = sum;
					y2 = 0;
				} else if (sum <= x + over + y) {
					x2 = x + over;
					y2 = sum - x2;
				} else {
					x2 = x;
					y2 = y;
				}
				print(x2, y2);
			}
		}
		pw.flush();
	}

	static void print(int x, int y) {
		if (swap) {
			int t = x;
			x = y;
			y = t;
		}
		if (yFlg) {
			y *= -1;
		}
		if (xFlg) {
			x *= -1;
		}
		pw.println(x + " " + y);
	}
}
