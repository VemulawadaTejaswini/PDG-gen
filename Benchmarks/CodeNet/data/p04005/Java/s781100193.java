import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long[] num = { a, b, c};
		
		if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
			System.out.println(0);
			return;
		}
		long max = 0;
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i]; 
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] == max) {
				num[i] = 1;
				break;
			}
		}
		long ans = 1;
		for (int i = 0; i < num.length; i++) {
			ans *= num[i];
		}
		System.out.println(ans);
	}

}
