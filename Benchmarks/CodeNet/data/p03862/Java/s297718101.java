import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextLong();
		long prev = 0;
		long total = 0;
		for (int i = 0; i < n; i++) {
			long t = sc.nextLong();
			if (t + prev > x) {
				long s = t + prev - x;
				prev = t - s;
				total += s;
			} else {
				prev = t;
			}
		}
		System.out.println(total);
	}
}
