import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		if(Math.min(n, m) >= 3) {
			System.out.println((n - 2) * (m - 2));
		} else if(n == 2 || m == 2) {
			System.out.println(0);
		} else if(n * m <= 2 && Math.min(n, m) == 1) {
			System.out.println(0);
		} else {
			System.out.println(n * m - 2);
		}
	}
}
