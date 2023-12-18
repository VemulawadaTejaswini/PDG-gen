
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = Long.MAX_VALUE;
		for(long i = 1; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				long tmp = n / i;
				ans = Math.min(tmp + i - 2, ans);
			}
		}
		System.out.println(ans);
	}

}
