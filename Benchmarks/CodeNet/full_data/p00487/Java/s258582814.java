import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] count;
	static long[] sum;
	static int size;

	static void add(int val, int pos, int lo, int hi) {
		++count[pos];
		sum[pos] += val;
		if (hi - lo == 1) {
			return;
		}
		int mid = (lo + hi) / 2;
		if (val < mid) {
			add(val, pos * 2 + 1, lo, mid);
		} else {
			add(val, pos * 2 + 2, mid, hi);
		}
	}

	static int howMany(int countSum, long fooSum, long minB, int pos, int lo, int hi) {
		if (fooSum + sum[pos] <= minB * (countSum + count[pos])) {
			return countSum + count[pos];
		}
		if (count[pos] == 0) return countSum;
		if (hi - lo == 1) {
			return -1;
		}
		int mid = (lo + hi) / 2;
		int ret = howMany(countSum, fooSum, minB, pos * 2 + 1, lo, mid);
		if (ret == -1) {
			return -1;
		}
		if (ret < countSum + count[pos * 2 + 1]){
			return ret;
		}
		int ret2 = howMany(countSum + count[pos * 2 + 1], fooSum + sum[pos * 2 + 1], minB, pos * 2 + 2, mid, hi);
		if (ret2 > 0) return ret2;
		return ret;
	}

	static int howMany(int minB) {
		return howMany(0, 0, minB, 0, 0, size);
	}

	public static void main(String[] args) {
		int N = sc.nextInt();
		size = 1;
		while (size < 100000) {
			size *= 2;
		}
		count = new int[size * 2];
		sum = new long[size * 2];
		Bug[] bugs = new Bug[N];
		for (int i = 0; i < N; ++i) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			bugs[i] = new Bug(a, b);
		}
		Arrays.sort(bugs, new Comparator<Bug>() {
			public int compare(Bug o1, Bug o2) {
				return o2.b - o1.b;
			}
		});
		int ans = 0;
		for (int i = 0; i < N; ++i) {
			add(bugs[i].a, 0, 0, size);
			if (i == N - 1 || bugs[i].b != bugs[i + 1].b) {
				ans = Math.max(ans, howMany(bugs[i].b));
			}
		}
		System.out.println(ans);
	}

	static class Bug {
		int a, b;

		Bug(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}

}