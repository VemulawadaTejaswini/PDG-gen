import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int M = sc.nextInt();
			Log[] logs = new Log[M];
			for (int i = 0; i < M; ++i) {
				int t = Integer.parseInt(sc.next());
				int s = Integer.parseInt(sc.next()) - 1;
				int d = Integer.parseInt(sc.next()) - 1;
				logs[i] = new Log(t, s, d);
			}
			Arrays.sort(logs);
			BitSet v = new BitSet(N);
			v.set(0);
			for (int i = 0; i < M; ++i) {
				if (v.get(logs[i].s)) v.set(logs[i].d);
			}
			System.out.println(v.cardinality());
		}
	}

	static class Log implements Comparable<Log> {
		int t, s, d;

		public Log(int t, int s, int d) {
			this.t = t;
			this.s = s;
			this.d = d;
		}

		public int compareTo(Log o) {
			return this.t - o.t;
		}
	}
}