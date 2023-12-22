import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		int ans = 0;
		for (int i=2; i<=n; i++) {
			if (n % i == 0) {
				n /= i;
				ans++;
			}
		}

		System.out.println(ans);
		sc.close();
	}

}