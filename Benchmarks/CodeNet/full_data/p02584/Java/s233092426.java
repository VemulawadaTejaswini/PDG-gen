import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		sc.close();
		
		x = Math.abs(x);
		
		long ans;
		if (k <= x / d) {
			ans = x - k * d;
		} else if ((k - x / d) % 2 == 1) {
			ans = Math.abs(x % d - d);
		} else {
			ans = x % d;
		}
		
		System.out.println(ans);
		
	}
}


