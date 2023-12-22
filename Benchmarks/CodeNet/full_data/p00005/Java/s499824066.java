import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long c = LCM(a, b);
		long d = a * b / c;
		System.out.println(c + " " + d);
	}
	
	static long LCM(long a, long b) {
		if (b == 0) {
			return a;
		} else {
			return LCM(b, a % b);
		}
	}
}