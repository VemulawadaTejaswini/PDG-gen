import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] x = new long[n];
		long[] y = new long[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
		}
		long cost = n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j) {
					long p = x[j] - x[i];
					long q = y[j] - y[i];
					int tmp = 1;
					Set<Pair> set = new TreeSet<>(new Pairsort());
					set.add(new Pair(x[i], y[i]));
					set.add(new Pair(x[j], y[j]));
					for (int k = 0; k < n; k++) {
						if (!set.contains(new Pair(x[k], y[k]))) {
							if (!set.contains(new Pair(x[k] + p, y[k] + q)) && !set.contains(new Pair(x[k] - p, y[k] - q))) {
								tmp++;
								set.add(new Pair(x[k], y[k]));
							}
						}
					}
					cost = Math.min(cost, tmp);
				}
			}
		}
		System.out.println(cost);
	}
}

class Pair {
	public long x;
	public long y;
	public Pair(long x, long y) {
		this.x = x;
		this.y = y;
	}
}

class Pairsort implements Comparator<Pair> {
	@Override
	public int compare(Pair sort1, Pair sort2) {
		if (sort1.x == sort2.x) {
			return (int)(sort1.y - sort2.y);
		} else if (sort1.x > sort2.x) {
			return 1;
		} else {
			return -1;
		}
	}
}

