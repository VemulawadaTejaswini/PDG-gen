
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int count = sc.nextInt();
		while (h != 0 && w != 0 && count != 0) {
			int[][] route = new int[h][w];
			for (int i = 0; i < h; ++i) {
				for (int j = 0; j < w; ++j) {
					route[i][j] = sc.nextInt();
				}
			}
			System.out.println(solve(h, w, count, route));
			h = sc.nextInt();
			w = sc.nextInt();
			count = sc.nextInt();
		}
	}

	public static String solve(int h, int w, int count, int[][] route) {

		int i = 0, j = 0;
		for (int c = 0; c < count; ++c) {
			i = 0;
			j = 0;
			while (i < h && j < w) {
				if (route[i][j] == 1) {
					route[i][j] = 0;
					++j;
				} else {
					route[i][j] = 1;
					++i;
				}
			}
		}
		return (i + 1) + " " + (j + 1);
	}
}