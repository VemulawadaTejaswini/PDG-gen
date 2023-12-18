import java.util.*;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0;i < n;i++) a[i] = sc.nextLong();
		if (is(a)) {
			System.out.println(n*2-1);
			return;
		}
		long ret = calc(a,true);
		ret = Math.min(calc(a,false),ret);
		System.out.println(ret);
	}

	private static boolean is(long[] a) {
		for (int i = 0;i < a.length;i++) {
			if (a[i]!=0) return false;
		}
		return true;
	}

	private static long calc(long[] a, boolean b) {
		long sum = a[0];
		long ret = 0;
		if (b) {
			ret = Math.abs(sum)+1;
			if (sum<0) {
				sum = 1;

			} else {
				sum = -1;
			}
		}
		long tmp = 0;
		for (int i = 1;i < a.length;i++) {
			long num = a[i];
			tmp = sum;
			sum += num;
			if ((tmp<0&&sum>=0)||(tmp>=0&&sum<0)) continue;
			long l = Math.abs(sum)+1;
			if (sum>=0) {
				sum -= l;
			} else {
				sum += l;
			}
			ret += l;
		}
		if (sum==0) ret++;
		return ret;
	}
}
