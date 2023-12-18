
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = 0;
		for(long i = 0; i < n; i++) {
			long a = sc.nextLong();
			while(a % 2 == 0) {
				ans++;
				a /= 2;
			}
		}
		System.out.println(ans);

	}

}
