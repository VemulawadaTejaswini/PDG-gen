import java.util.*;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		long h = sc.nextLong();
		long w = sc.nextLong();
		if (h%3==0||w%3==0) {
			System.out.println(0);
			return;
		}
		long ret = Integer.MAX_VALUE;
		ret = Math.min(ret, c1(h,w));
		ret = Math.min(ret, c1(w,h));
		System.out.println(ret);
	}

	private static long c1(long h, long w) {
		long tw = w/2;
		long a = 0;
		long b = 0;
		long c = 0;
		long ret = Long.MAX_VALUE;
		for (int i = 1;i < h;i++) {
			a = i*w;
			b = (h-i)*tw;
			c = h*w-(a+b);
			ret = Math.min(ret, Math.max(a,Math.max(b,c))-Math.min(a,Math.min(b,c)));
		}
		return ret;
	}
}
