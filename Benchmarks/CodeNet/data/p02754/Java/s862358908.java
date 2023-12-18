import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			// 端数
			long mod = n % (a + b);
			if(mod <= a) {
				System.out.println(a * (n / (a + b)) + mod);
			} else {
				System.out.println(a * (n / (a + b)) + a);
			}
		}

	}

}
