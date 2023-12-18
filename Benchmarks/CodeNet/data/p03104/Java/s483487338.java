import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong() - 1;
		long b = sc.nextLong();
		long xa = xorsum(a);
		long xb = xorsum(b);
		System.out.println(xa ^ xb);
	}
	static long xorsum(long n) {
		if (n % 2 == 0 && n / 2 % 2 == 0) {
			return n;
		} else if (n % 2 == 0 && n / 2 % 2 != 0) {
			return n + 1;
		} else if (n % 2 != 0 && n / 2 % 2 == 0) {
			return 1;
		} else {
			return 0;
		}
	}
}