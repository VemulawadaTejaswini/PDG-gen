
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) break;
			T[] ts = new T[n];
			for (int i=0;i<n;i++) {
				String name = sc.next();
				int p = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(),
					d = sc.nextInt(), e = sc.nextInt(), f = sc.nextInt(), s = sc.nextInt(), m = sc.nextInt();
				ts[i] = new T(f * s * m - p, a + b + c + ( d + e) * m, name);
			}
			sort(ts);
			for (int i=0;i<n;i++) {
//				debug(ts[i].v, ts[i].w);
				System.out.println(ts[i].name);
			}
			System.out.println("#");
		}
	}
	
	class T implements Comparable<T> {
		int v, w;
		String name;
		T(int v, int w, String name) {
			this.v = v;
			this.w = w;
			this.name = name;
		}
		@Override
		public int compareTo(T o) {
			// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?
			if (v * o.w != o.v * w) return o.v * w - v * o.w;
			return name.compareTo(o.name);
		}
	}
	
	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}