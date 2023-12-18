import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		System.out.println(k * pow(k - 1, n - 1));
	}
	
	static long pow(long p, int x) {
		if (x == 0) {
			return 1;
		} else {
			return p * pow(p, x - 1);
		}
	}
}
