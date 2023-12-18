import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();

		long ans = 0;

		if (a > k) {
			ans = k;
			k = 0;
		} else {
			ans = a;
			k -= a;
		}

		if (k > 0) {
			if (b > k) {
				k = 0;
			} else {
				k -= b;
			}
		}

		if (k > 0){
			if (c > k) {
				ans -= k;
				k = 0;
			} else {
				ans -= c;
				k -= c;
			}
		}

		System.out.println(ans);
	}


}