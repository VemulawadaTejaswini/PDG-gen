import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		List<P> list = new ArrayList<P>();	
		for (int i=0; i<N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (2<=a-1 && a-1<H && 2<=b-1 && b-1<W) list.add(new P(a-1, b-1));
			if (2<=a   && a  <H && 2<=b-1 && b-1<W) list.add(new P(a  , b-1));
			if (2<=a+1 && a+1<H && 2<=b-1 && b-1<W) list.add(new P(a+1, b-1));
			if (2<=a-1 && a-1<H && 2<=b   && b  <W) list.add(new P(a-1, b  ));
			if (2<=a   && a  <H && 2<=b   && b  <W) list.add(new P(a  , b  ));
			if (2<=a+1 && a+1<H && 2<=b   && b  <W) list.add(new P(a+1, b  ));
			if (2<=a-1 && a-1<H && 2<=b+1 && b+1<W) list.add(new P(a-1, b+1));
			if (2<=a   && a  <H && 2<=b+1 && b+1<W) list.add(new P(a  , b+1));
			if (2<=a+1 && a+1<H && 2<=b+1 && b+1<W) list.add(new P(a+1, b+1));
		}
		Collections.sort(list);
		//
		int[] cnt = new int[10];
		int c = 0;
		P q = null;
		for (P p: list) {
			if (c==0) {
				c++;
				q = p;
				continue;
			}
			if (p.equals(q)) {
				c++;
			} else {
				cnt[c]++;
				c = 1;
				q = p;
			}
		}
		if (c!=0) cnt[c]++;
		System.out.println(((long)H-2)*((long)W-2)-array_sum(cnt));
		for (int i=1; i<10; i++) {
			System.out.println(cnt[i]);
		}
		//
		sc.close();
	}
	
	private static long array_sum(int[] array) {
		int sum = 0;
		for (int a: array) sum+=a;
		return sum;
	}

	private static class P implements Comparable<P> {
		private final int v1;
		private final int v2;
		public P(int v1, int v2) {
			this.v1 = v1;
			this.v2 = v2;
		}
		public int x() { return v1; }
		public int y() { return v2; }
		@Override public int compareTo(P o) {
			if (v1!=o.v1) return Integer.compare(v1, o.v1);
			return Integer.compare(v2, o.v2);
		}
		@Override public int hashCode() {
			int result = 17;
			result += 31*result + v1;
			result += 31*result + v2;
			return result;
		}
		@Override public boolean equals(Object o) {
			if (!(o instanceof P)) return false;
			P p = (P)o;
			if (v1!=p.v1) return false;
			if (v2!=p.v2) return false;
			return true;
		}
		@Override public String toString() {
			return String.format("{%d, %d}", v1, v2);
		}
	}

	
}
