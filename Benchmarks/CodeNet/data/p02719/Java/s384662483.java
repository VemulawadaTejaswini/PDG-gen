import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		
		long s = n % k;
		long ans = Long.min(s, Math.abs(s - k));
		System.out.println(ans);
		
	}
}
