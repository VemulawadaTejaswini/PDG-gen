import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		if (h == 1 && w == 1) {
			System.out.println("Yes");
			return;
		}
		String[][] s = new String[h][w];
		for (int i = 0; i < h; i++)
			s[i] = sc.next().split("");
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (s[i][j].equals(".")) continue;
				boolean able = false;
				if (i - 1 >= 0 && s[i - 1][j].equals("#"))
					able = true;
				if (j - 1 >= 0 && s[i][j - 1].equals("#"))
					able = true;
				if (i + 1 < h && s[i + 1][j].equals("#"))
					able = true;
				if (j + 1 < w && s[i][j + 1].equals("#"))
					able = true;
				if (!able) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}