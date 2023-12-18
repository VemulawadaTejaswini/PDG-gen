import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] s = new char[h][w];
		for (int i = 0; i < h; i++) {
			s[i] = sc.next().toCharArray();
		}
		sc.close();

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (s[i][j] == '#') {
					boolean flg = false;
					if (i - 1 >= 0 && s[i - 1][j] == '#') flg = true;
					if (i + 1 < h && s[i + 1][j] == '#') flg = true;
					if (j - 1 >= 0 && s[i][j - 1] == '#') flg = true;
					if (j + 1 < w && s[i][j + 1] == '#') flg = true;
					if (!flg) {
						System.out.println("No");
						return;
					}
				}
			}
		}
		System.out.println("Yes");
	}
}
