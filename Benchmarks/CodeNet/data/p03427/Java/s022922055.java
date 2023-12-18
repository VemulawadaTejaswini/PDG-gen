import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = 0;
		
		if (n < 10) {
			ans = n;
			System.out.println(ans);
			return;
		}
		
		String s = Long.toString(n);
		ans = 9 * (s.length() - 1);
		ans += n / Math.pow(10, s.length() - 1);
		
		if (!s.substring(1).matches("^9+$")) {
			ans--;
		}
		
		System.out.println(ans);
	}	
}
