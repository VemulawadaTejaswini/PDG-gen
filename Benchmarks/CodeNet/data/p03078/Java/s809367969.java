import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int K = sc.nextInt();
		long[] a = new long[x];
		long[] b = new long[y];
		long[] c = new long[z];
		for (int i = 0; i < x; i++) {
			a[i] = sc.nextLong();
		}
		for (int i = 0; i < y; i++) {
			b[i] = sc.nextLong();
		}
		for (int i = 0; i < z; i++) {
			c[i] = sc.nextLong();
		}
		sc.close();
 
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		Arrays.parallelSort(c);

		PriorityQueue<Obj> pq = new PriorityQueue<Obj>(new Comparator<Obj>() {
			public int compare(Obj o1, Obj o2) {
				if (o1.v < o2.v) return 1;
				if (o1.v > o2.v) return -1;
				return 0;
			}
		});
		Set<Long> set = new HashSet<Long>();

		int ia = x - 1;
		int ib = y - 1;
		int ic = z - 1;
		Obj fo = new Obj(ia, ib, ic, a[ia] + b[ib] + c[ic]);
		pq.add(fo);
		long fl = ia * 10000L * 10000L + ib * 10000L + ic;
		set.add(fl);

		for (int i = 0; i < K; i++) {
			Obj obj = pq.poll();
			System.out.println(obj.v);
			ia = obj.a;
			ib = obj.b;
			ic = obj.c;
			if (ia > 0) {
				Obj o = new Obj(ia - 1, ib, ic, a[ia - 1] + b[ib] + c[ic]);
				long l = (ia - 1) * 10000L * 10000L + ib * 10000L + ic;
				if (!set.contains(l)) {
					pq.add(o);
					set.add(l);
				}
			}
			if (ib > 0) {
				Obj o = new Obj(ia, ib - 1, ic, a[ia] + b[ib - 1] + c[ic]);
				long l = ia * 10000L * 10000L + (ib - 1) * 10000L + ic;
				if (!set.contains(l)) {
					pq.add(o);
					set.add(l);
				}
			}
			if (ic > 0) {
				Obj o = new Obj(ia, ib, ic - 1, a[ia] + b[ib] + c[ic - 1]);
				long l = ia * 10000L * 10000L + ib * 10000L + (ic - 1);
				if (!set.contains(l)) {
					pq.add(o);
					set.add(l);
				}
			}
		}
	}

	static class Obj {
		int a, b, c;
		long v;
		Obj(int a, int b, int c, long v) {
			this.a = a;
			this.b = b;
			this.c = c;
			this.v = v;
		}

		public boolean equals(Object obj) {
			Obj o = (Obj) obj;
			if (this.a == o.a && this.b == o.b && this.c == o.c && this.v == o.v) {
				return true;
			}
			return false;
		}

		public String toString() {
			return this.a + " " + this.b + " " + this.c + " " + this.v;
		}
	}
}
