import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long k = sc.nextLong();

		long ans = n;
		long x = n;
		if (x > k) {
			x = k + (x % k);
		}
		HashSet<Long> map = new HashSet<Long>();
		while (true){

			long diff = Math.abs(x - k);
			if (map.contains(diff)){
				break;
			}
			map.add(diff);
			ans = Math.min(ans, diff);
			x = diff;
		}
		System.out.println(ans);
	}
}