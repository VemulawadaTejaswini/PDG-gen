import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		long min = Long.MAX_VALUE;
		long total = 0;
		for (int i = 0; i < n; i++) {
			long a = sc.nextInt();
			if (a < 0) {
				total -= a;
				count++;
			} else {
				total += a;
			}
			min = Math.min(min, Math.abs(a));
		}
		if (count % 2 == 1) {
			total -= min * 2;
		}
		System.out.println(total);
	}
}
