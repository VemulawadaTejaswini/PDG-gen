
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long ans = 0;
		ans += (n / (a + b)) * a;
		n %= (a + b);
		if(n >= a) {
			ans += a;
		} else {
			ans += n;
		}
		System.out.println(ans);
	}

}
