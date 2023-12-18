
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

	public static final long MOD = 998244353;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Robot[] robots = new Robot[n];
		for (int i=0;i<n;i++) {
			Robot r = new Robot();
			r.x=sc.nextInt();
			r.d=sc.nextInt();
			robots[i]=r;
		}
		Arrays.sort(robots,Comparator.comparing((Robot r)->r.x));
		int[] pos = new int[n];
		for (int i=0;i<n;i++) {
			pos[i]=robots[i].x;
		}
		SegmentTree safe = new SegmentTree(1<<17);
		safe.update(n-1, n);

		for (int i=n-2;i>=0;i--) {

			int reach = ceiling(pos, robots[i].x+robots[i].d);
			long x = safe.query(i, reach);
			if (x > 0) {
				safe.update(i, x);
			} else {
				safe.update(i, i+1);
			}
		}

		long[] dp = new long[n+1];
		dp[n]=1;
		for (int i=n-1;i>=0;i--) {
			dp[i]=(dp[i+1]+dp[(int)safe.query(i,i+1)])%MOD;
		}
		System.out.println(dp[0]);
	}

	static int ceiling(int[] x, int key) {
		int n = x.length;
		int min = -1;
		int max = n-1;
		if (x[n-1]<key) {
			return n;
		}

		while (max-min>1) {
			int mid = (max+min)/2;
			if (x[mid]>=key) {
				max = mid;
			} else {
				min = mid;
			}
		}
		return max;

	}

}

class Robot {
	int x;
	int d;
}

class SegmentTree {
	//simple segment tree using long values and max
	long[] array;
	int len;
	long unit;
	public SegmentTree(int len) {

		this.array = new long[len*2];
		this.len = len;
		this.unit = Long.MIN_VALUE;
	}

	void update(int pos, long val) {
		int index = pos + this.len-1;
		array[index] = val;
		while (index > 0) {
			index = (index-1)/2;
			array[index] = Math.max(array[index*2+1], array[index*2+2]); // change here
		}
	}

	long query (int a, int b) {
		return query(a, b, 0, 0, this.len);
	}
	//Query for [a, b). k is the node number for [l,r)
	//usage: query(a, b, 0, 0, len)
	long query(int a, int b, int k, int l, int r) {
		if (b<=l || r<=a) {
			return unit;
		} else if (a<=l && r<=b) {
			return array[k];
		} else {
			return (Math.max(query(a,b,2*k+1,l,(l+r)/2), query(a,b,2*k+2,(l+r)/2,r))); // change here
		}
	}

	public String toString() {
		ArrayList<Long> list = new ArrayList<Long>();
		for (int i=0;i<10;i++) {
			list.add(array[len+i-1]);
		}
		return list.toString();
	}
}

