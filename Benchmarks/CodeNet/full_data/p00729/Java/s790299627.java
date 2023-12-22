import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int N = nextInt();// PC数
			if (N == 0) {
				break;
			}
			int M = nextInt();// 学生数

			int r = nextInt();// 記録数
			int[] loginNum = new int[M];// 学生iのログインしている台数
			HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
			for (int i = 0; i < M; i++) {
				map.put(i + 1, new ArrayList<Integer>());
			}

			for (int i = 0; i < r; i++) {
				int time = nextInt();
				int nPC = nextInt();
				int m = nextInt();
				int s = nextInt();

				if (s == 0) {
					// ログアウト時
					loginNum[m - 1]--;
					if (loginNum[m - 1] == 0) {
						// 最後のログアウト
						map.get(m).add(time);
					}
				} else {
					// ログイン時
					loginNum[m - 1]++;
					if (loginNum[m - 1] == 1) {
						// 最初のログイン
						map.get(m).add(time);
					}
				}
			}

			int q = nextInt();
			for (int i = 0; i < q; i++) {
				int start = nextInt();
				int stop = nextInt();
				int student = nextInt();
				int use = 0;
				for (int j = 0; j * 2 < map.get(student).size(); j++) {
					int on = map.get(student).get(j * 2);
					int off = map.get(student).get(j * 2 + 1);
					if (off <= start || on >= stop) {
						// 開始時刻より前のことはどうでも良い
						continue;
					}
					if (on <= start) {
						on = start;
					}
					if (off >= stop) {
						off = stop;
					}
					use += off - on;
				}

				System.out.println(use);

			}

		}
	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

	static char nextChar() {
		try {
			int b = System.in.read();
			while (b != -1 && (b == ' ' || b == '\r' || b == '\n'))
				;
			if (b == -1)
				return 0;
			return (char) b;
		} catch (IOException e) {
		}
		return 0;
	}

}