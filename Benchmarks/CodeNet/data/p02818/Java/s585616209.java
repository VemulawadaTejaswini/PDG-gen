
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long k = scan.nextLong();
		
		long copyA = a;
		if (a >= k) {
			a = a - k;
		} else if (b >= k - a) {
			a = 0;
			b = b - (k - copyA);
		} else {
			a = 0;
			b = 0;
		}
		
		System.out.println(a);
		System.out.println(b);
		
		
	}
}