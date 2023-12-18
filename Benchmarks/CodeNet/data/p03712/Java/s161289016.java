import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next()) + 2;
		int w = Integer.parseInt(sc.next());
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < w; i++)
			s.append("#");
		String t = s.toString();
		String[][] ans = new String[h][3];
		for (int i = 0; i < h; i++) {
			ans[i][0] = "#";
			ans[i][2] = "#";
			if (i == 0 || i == h - 1)
				ans[i][1] = t;
			else
				ans[i][1] = sc.next();
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(ans[i][j]);
			System.out.println("");
		}
	}
}