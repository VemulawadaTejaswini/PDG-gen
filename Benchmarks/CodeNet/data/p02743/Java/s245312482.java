import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		long b = scn.nextLong();
		long c = scn.nextLong();
		String ans = Val(a, b, c);
		System.out.println(ans);

	}

	public static String Val(long a, long b, long c) {
		long p = c - a - b;
		if (p < 0) {
			return "NO";
		}
		double x1 = (double) p / 2;
		x1 = (double) Math.pow(x1, 2);
		double x2 = (double) a * b;
		if (x2 < x1) {
			return "YES";
		}
		return "NO";
	}
}