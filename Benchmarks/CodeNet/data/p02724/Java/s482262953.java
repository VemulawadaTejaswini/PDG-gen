import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double x = n % 100;
		if (n % 500 == 0) {
			System.out.println(n / 500 * 1000);
		} else {
			if (x % 5 == 0) {
				System.out.println(x / 5 * 5 + Math.floor(n / 500 * 1000));
			} else if (x % 5 != 0) {
				System.out.println(Math.floor(x / 5) * 5 + Math.floor(n / 500) * 1000);
			}
		}

	}

}
