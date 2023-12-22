import java.io.IOException;
import java.util.Stack;


public class Main {
	static class Inp extends Stack<Integer> {}

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
		Inp		inp = new Inp();
		Lst		lst = new Lst();
		int[]	ans = new int[10001];
		int		num = 0;
		int		max = 0;

		while((num = parseNum()) != 0) {
			inp.push(num);
			max = (num > max)?num:max;
		}

		getList(max, lst, ans);

		while (inp.size() > 0) {
			int o = ans[inp.remove(0)];
			System.out.println((o-2)+" "+o);
		}
	}

	private static void getList(int max, Lst lst, int[] ans) {
		lst.add(2);
		lst.add(3);

		for(int num = 5; num <= max; num += 2) {
			for (int i = 0; i < lst.size(); i++) {
				int	nWk = lst.get(i);
				if (nWk > (int)Math.sqrt(num)) {
					if (num-lst.get(lst.size()-1)==2) {
						ans[num] = num;
					}
					lst.add(num);
					break;
				}
				if (num % nWk == 0) {
					break;
				}
			}
		}

		for(int i = 1; i <= max; i++) {
			ans[i] = (ans[i]==0)?ans[i-1]:ans[i];
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
}