import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		// a >= k && a < b
		long ans = 0;
		for(long i = k ; i < n ; i++) {
			ans += n - i;
		}
		// a >= b && a % b >= k
		for(long i = k ; i <= n ; i++) {
			for(int j = 1 ; j <= n ; j++) {
				if(i >= j && i % j >= k) {
					System.out.println(i + " " + j);
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
