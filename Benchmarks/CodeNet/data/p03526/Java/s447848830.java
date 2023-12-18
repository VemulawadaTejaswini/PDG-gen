/*input
4 3
1 2 6
3 4 5
2 3 7
*/
import java.util.Scanner;
import java.lang.*;
import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class value {
	long h, p;
	value(long h, long p) {
		this.h = h;
		this.p = p;
	}
}

class cmp implements Comparator<value> {
	public int compare(value a, value b) {
		return (int)(a.h + a.p) - (int)(b.h + b.p);
	}
}

public class Main {
	private static final int N = (int)5e3 + 100;
	private static final long oo = (long) 1e18;

	static int n;
	static value[] a = new value[N];

	static Comparator<Long> CmpLong = new Comparator<Long>() {
		public int compare(Long x, Long y) {
			return (int)(y - x);
		}
	};

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		n = inp.nextInt();
		for(int i = 1; i <= n; i += 1) {
			long h = inp.nextLong();
			long p = inp.nextLong();
			a[i] = new value(h, p);
		}
		ArrayList<value> tmp = new ArrayList<value>();
		for(int i = 1; i <= n ; ++i) tmp.add(a[i]);
		Collections.sort(tmp, new cmp());

		PriorityQueue<Long> pq = new PriorityQueue<Long>(CmpLong);
		long sum = 0L, ans = 0L;
		for(value v: tmp) {
			sum += v.p;
			pq.add(v.p);

			while(sum > v.h + v.p) {
				sum -= pq.remove();
			}
			ans = Math.max(ans, pq.size());
		}
		System.out.print(ans);
	}	
}