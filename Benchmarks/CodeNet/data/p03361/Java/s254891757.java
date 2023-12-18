import java.io.UnsupportedEncodingException;
import java.util.*;

public class Main {

	static int max_X;
	static int max_Y;

	public static void main(String[] args) throws UnsupportedEncodingException {

		Scanner sc = new Scanner(System.in);

		String ans = "Yes";

		int i = sc.nextInt();
		int j = sc.nextInt();
		max_X = j;
		max_Y = i;

		// 適当に格納
		// ArrayList<char[]> map = new ArrayList<char[]>();
		char[][] map = new char[j][i];
		int h, w;
		for (h = 0; h < j; h++) {
			String st = sc.next();
			int n = 0;
			for (n = 0; n < st.length(); n++) {
				map[h][n] = st.charAt(n);
			}
		}

		for (h = 0; h < j; h++) {
			for (w = 0; w < i; w++) {
				if (!check(w, h, map)) {
					ans = "No";
					break;

				}
			}
		}
		System.out.println(ans);
		sc.close();
	}

	private static boolean check(int w, int h, char[][] map) {

		boolean ischeck = false;

		if (map[h][w] == '.') {
			return true;
		}

		// 左
		if (w - 1 >= 0) {
			if (map[h][w - 1] == '#') {
				ischeck = true;
				return ischeck;
			}
		}

		// 右
		if (w + 1 < max_X) {
			if (map[h][w + 1] == '#') {
				ischeck = true;
				return ischeck;
			}
		}

		// 上
		if (h - 1 >= 0) {
			if (map[h - 1][w] == '#') {
				ischeck = true;
				return ischeck;
			}
		}

		// 下
		if (h + 1 < max_Y) {
			if (map[h + 1][w] == '#') {
				ischeck = true;
				return ischeck;
			}
		}

		return ischeck;
	}

}
