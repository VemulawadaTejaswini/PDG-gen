import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		String s[][] = new String[h][w];
		for (int i = 0; i < h; i++) {
			String sh = sc.next();
			for (int j = 0; j < w; j++) {
				s[i][j] = sh.substring(j, j + 1);
				//				System.out.print(s[i][j]);
			}
			//			System.out.println("");
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				//Mineはスルー
				if (s[i][j].equals("#")) {
					continue;
				}

				//処理
				int cnt = 0;
				try {
					if (s[i - 1][j - 1].equals("#"))
						cnt++;
				} catch (Exception e) {
				}
				try {
					if (s[i - 1][j].equals("#"))
						cnt++;
				} catch (Exception e) {
				}
				try {
					if (s[i - 1][j + 1].equals("#"))
						cnt++;
				} catch (Exception e) {
				}
				try {
					if (s[i][j - 1].equals("#"))
						cnt++;
				} catch (Exception e) {
				}
				try {
					if (s[i][j].equals("#"))
						cnt++;
				} catch (Exception e) {
				}
				try {
					if (s[i][j + 1].equals("#"))
						cnt++;
				} catch (Exception e) {
				}
				try {
					if (s[i + 1][j - 1].equals("#"))
						cnt++;
				} catch (Exception e) {
				}
				try {
					if (s[i + 1][j].equals("#"))
						cnt++;
				} catch (Exception e) {
				}
				try {
					if (s[i + 1][j + 1].equals("#"))
						cnt++;
				} catch (Exception e) {
				}
				s[i][j] = Integer.toString(cnt);
			}
		}

		//ans部分
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(s[i][j]);
			}
			System.out.println("");
		}

	}

}
