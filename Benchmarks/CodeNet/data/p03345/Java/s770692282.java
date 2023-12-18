import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double k = sc.nextDouble();

		if (Math.abs(a-b) > Math.pow(10, 18)) {
			System.out.println("Unfair");
		} else if (k % 2 == 0) {
			System.out.println(a-b);
		} else {
			System.out.println(b-a);
		}
	}
}