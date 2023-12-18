
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long ans = 0;
		while(n > 0) {
			if(n >= a) {
				ans += a;
				n -= a;
			} else {
				ans += n;
				n = 0;
			}
			n -= b;
		}
		System.out.println(ans);
	}

}
