import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	int mod = 1000000007;

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				return;
			}
			Info info[] = new Info[n];
			for (int i = 0; i < n; i++) {
				info[i] = new Info(sc.nextInt(), sc.nextInt(), sc.nextInt(),
						sc.nextInt());
			}
			Arrays.sort(info, new ComparatorInfo());
			ArrayList<Info> al = new ArrayList<Info>();
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				int groupCnt = 0;
				Info now = info[i];
				for (int j = 0; j < al.size(); j++) {
					if (now.group == al.get(j).group) {
						groupCnt++;
					}
				}
				if (cnt < 10) {
					if (groupCnt < 3) {
						al.add(now);
						cnt++;
					}
				} else if (cnt < 20) {
					if (groupCnt < 2) {
						al.add(now);
						cnt++;
					}
				} else if (cnt < 26) {
					if (groupCnt == 0) {
						al.add(now);
						cnt++;
					}
				}
			}
			for (int i = 0; i < al.size(); i++) {
				System.out.println(al.get(i).id);
			}
		}
	}

	class Info {
		int id;
		int group;
		int accept;
		int pena;

		public Info(int id, int group, int accept, int pena) {
			super();
			this.id = id;
			this.group = group;
			this.accept = accept;
			this.pena = pena;
		}
	}

	class ComparatorInfo implements Comparator<Info> {
		@Override
		public int compare(Info arg0, Info arg1) {
			// TODO 自動生成されたメソッド・スタブ
			int cmp = 0;
			if (arg0.accept < arg1.accept) {
				cmp = 1;
			} else if (arg0.accept == arg1.accept) {
				if (arg0.pena > arg1.pena) {
					cmp = 1;
				} else if (arg0.pena < arg1.pena) {
					cmp = -1;
				} else {
					if (arg0.id > arg1.id) {
						cmp = 1;
					} else {
						cmp = -1;
					}
				}
			}
			return cmp;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	class MyScanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
			try {
				StringBuilder res = new StringBuilder("");
				int c = System.in.read();
				while (Character.isWhitespace(c))
					c = System.in.read();
				do {
					res.append((char) c);
				} while (!Character.isWhitespace(c = System.in.read()));
				return res.toString();
			} catch (Exception e) {
				return null;
			}
		}
	}
}