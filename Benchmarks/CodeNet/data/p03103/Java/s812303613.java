import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
		solver.solve();
	}
}

class Solver {
	int N;
	int cnt;

	public void init() {
		N = 0;
		cnt = 0;
	}

	int M;

	class Shop {
		long A;
		long B;

		public Shop(long a, long b) {
			super();
			A = a;
			B = b;
		}
	}

	ArrayList<Shop> Shops = new ArrayList<Shop>();

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		M = Integer.parseInt(strArr[1]);
	}

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		String[] strArr = str.split(" ");
		long a = Long.parseLong(strArr[0]);
		long b = Long.parseLong(strArr[1]);
		Shops.add(new Shop(a, b));
		cnt++;
	}

	public void solve() {
		Collections.sort(Shops, new Comparator<Shop>() {
			@Override
			public int compare(Shop a, Shop b) {
				long d = a.A - b.A;
				if (d >= 0)
					return 0;
				else
					return -1;
			}
		});
		long m = M;
		long ans = 0;
		for (Shop s : Shops) {
			// System.out.println(s.A + " " + s.B);
			int d;
			if (m > s.B) {
				ans += s.A * s.B;
				m -= s.B;
			} else {
				ans += s.A * m;
				m = 0;
			}
			if (m <= 0)
				break;
		}
		System.out.println(ans);
	}
}
