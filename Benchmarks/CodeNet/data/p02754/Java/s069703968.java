import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long total = 0;
		
		if (n % (a + b) == 0) {
			total = n / (a + b) * a;
		} else if (n % (a + b) / a >= 1) {
			total = n / (a + b) * a + a;
		} else {
			total = n / (a + b) * a + n % (a + b);
		}
		
		System.out.println(total);
	}
}