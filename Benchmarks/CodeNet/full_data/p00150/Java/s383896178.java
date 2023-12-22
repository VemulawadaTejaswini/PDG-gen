import java.io.IOException;


public class Main {
	static class Lst {
		private	int[]	d = new int[10000];
		private	int		h = 0;
		private	int		t = 0;

		public void add(int e) {
			d[t++] = e;
		}

		public int get(int i) {
			return d[h+i];
		}

		public int size() {
			return t-h;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lst	lst = getList();
		int	inp = 0;

		while((inp = parseNum()) != 0) {
			int o = 0;
			for (int i = 0; i+1 <= lst.size() && lst.get(i+1) <= inp; i++) {
				int	a = lst.get(i);
				int	b = lst.get(i+1);

				if (a > inp || b > inp) break;
				if (b-a == 2) o = a;
			}
			System.out.println(o+" "+(o+2));
		}
	}

	private static int parseNum() {
		try {
			int	buf = 0;
			int	num = 0;
			int	mns = 0;
			int	skp = 1;

			// -,0〜9以外は読み飛ばす
			while (true) {
				buf = System.in.read();
				if (buf == '-') {
					mns = 1;
					skp = 0;
				} else if (buf >= '0' && buf <= '9') {
					num = num * 10 + (buf - '0');
					skp = 0;
				} else if ((skp == 0 || buf == -1) && buf != '.') {
					return (mns == 0)?num:num*(-1);
				}
			}
		} catch (IOException e) {}
		return -1;
	}

	private static Lst getList() {
		Lst	lst = new Lst();
		int	lim = 10000;

		lst.add(2);
		for(int num = 3; num <= lim; num += 2) {
			boolean	prm = true;

			for (int i = 0; i < lst.size(); i++) {
				int	nWk = lst.get(i);
				if (nWk <= (int)Math.sqrt((double)num)) {
					if (num % nWk == 0) {
						prm = false;
						break;
					}
				}
				else {
					break;
				}
			}

			if (prm) {
				lst.add(num);
			}
		}

		return lst;
	}
}