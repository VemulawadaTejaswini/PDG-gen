
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a * b * c % 2 == 0) {
			System.out.println(0);
		} else {
			int d = a / 2 * b * c;
			int e = (a - a / 2) * b * c;
			System.out.println(Math.abs(d - e));
		}
	}
}
