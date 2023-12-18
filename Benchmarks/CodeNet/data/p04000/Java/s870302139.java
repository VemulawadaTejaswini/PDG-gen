import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	private static int[][] buf = null;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] sp = line.split(" ");
		int h = Integer.parseInt(sp[0]);
		int w = Integer.parseInt(sp[1]);
		int n = Integer.parseInt(sp[2]);

		if (n == 0) {
			for (int j = 0; j < 10; j++) {
				System.out.println("0");
			}
			return;
		}

		buf = new int[h][w];
		for (int i = 0; i < n; i++) {
			line = br.readLine();
			sp = line.split(" ");
			int y = Integer.parseInt(sp[0]);
			int x = Integer.parseInt(sp[1]);
			buf[y - 1][x - 1] = 1;
		}

		for (int j = 0; j < 10; j++) {
			int sum = 0;
			for (int y = 0; y < h - 2; y++) {
				for (int x = 0; x < w - 2; x++) {
					sum += Main.check(y, x, j);
				}
			}
			System.out.println(sum);
		}
	}

	private static int check(int y, int x, int n) {
		int sum = 0;
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				if (buf[y + a][x + b] == 1) {
					sum++;
				}
			}
		}
		return (sum == n) ? 1 : 0;
	}
}
