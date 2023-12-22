import java.io.IOException;
import java.util.Arrays;

public class Main {
	/**
	* @param args
	*/

	static class Seat {
		public	int	b = 0;
	}

	static class Grp {
		public	int	s = 0;
		public	int	e = 0;
		public	int	n = 0;
		public	int	b = 0;
		public	int	w = -1;

		public Grp(int i) {
			this.s = i*5;
			this.e = 17*(i%2)+3*(i%3)+19;
			this.n = (i%5==1)?5:2;
		}
	}

	static class Lst {
		public	int[]	d = new int[101];
		public	int		h = 0;
		public	int		t = 0;

		public void add(int e) {
			d[t++] = e;
			this.sort();
		}

		public int get(int i) {
			return d[h+i];
		}

		public int remove(int i) {
			int	rmv = this.d[h];
			this.d[i] = 0;
			this.sort();
			this.h++;
			return rmv;
		}

		public int size() {
			return t-h;
		}

		public void sort() {
			Arrays.sort(d, h, t);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grp[]	g = new Grp[100];
		Seat	s = new Seat();
		Lst		e = new Lst();
		Lst		w = new Lst();
		boolean	f = true;
		int		o = 0;
		
		for (int i = 0; i < g.length; i++) {
			g[i] = new Grp(i);

			// 席があるかチェック
			if (isAvailableSeat(s, g[i]) && f) {
				// 食べ終わるグループリストへ追加
				e.add((g[i].s+g[i].w+g[i].e)*100+i);
			} else {
				// 待っているグループリストへ追加
				f = false;
				w.add(i);
			}
		}
		
		while(w.size() > 0) {
			int	a = e.remove(0);
			int	t = a/100;
			int	i = a%100;

			// 一グループが食べ終わった
			s.b = s.b&(~g[i].b);

			for(int b = 0; b < w.size(); b++) {
				// 待っているグループが席に座れるかチェック
				int j = w.get(b);

				// 待っているグループがこれ以上いなければ打ちきり
				if (g[j].s > t) break;

				// 席があるかチェック
				if (isAvailableSeat(s, g[j])) {
					// グループの待ち時間を計算
					g[j].w = Math.max(0, t-g[j].s);

					// 食べ終わるグループリストへ追加
					e.add((g[j].s+g[j].w+g[j].e)*100+j);

					w.remove(b--);
				} else {
					// 座れなかったら打ちきり
					break;
				}
			}
		}

		while ((o = parseNum()) != -1) {
			System.out.println(g[o].w);
		}
	}

	private static boolean isAvailableSeat(Seat s, Grp g) {
		boolean bSt = false;
		int		b   = (1<<g.n)-1;

		for (int i = 0; i <= 17-g.n && !bSt; i++, b<<=1) {
			if ((s.b&b) == 0) {
				s.b = s.b|b;
				g.b = b;
				g.w = 0;
				bSt = true;
			}
		}
		return bSt;
	}

	private static int parseNum() {
		try {
			int	buf = 0;
			int	num = -1;
			int	mns = 0;
			int	skp = 1;

			// -,0〜9以外は読み飛ばす
			while (true) {
				buf = System.in.read();
				if (buf == '-') {
					mns = 1;
					skp = 0;
				} else if (buf >= '0' && buf <= '9') {
					if (num == -1) num = 0;
					num = num * 10 + (buf - '0');
					skp = 0;
				} else if (skp == 0 || buf == -1) {
					return (mns == 0)?num:num*(-1);
				}
			}
		} catch (IOException e) {}
		return -1;
	}
}