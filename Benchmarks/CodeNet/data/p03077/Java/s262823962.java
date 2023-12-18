import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long e = sc.nextLong();
		FiveTrans ft = new FiveTrans(a, b, c, d, e);
		System.out.println(ft.calcTime(n));
	}
}

class FiveTrans {
	ArrayList<Long> limits = new ArrayList<Long>();
	
	public FiveTrans(long... limits) {
		for (long limit : limits) {
			this.limits.add(limit);
		}
	}
	
	public long calcTime(long n) {
		long minLimit = Long.MAX_VALUE;
		for (long limit : limits) {
			if (limit < minLimit) {
				minLimit = limit;
			}
		}
		long time = (n - 1) / minLimit + 5;
		return time;
	}
}
