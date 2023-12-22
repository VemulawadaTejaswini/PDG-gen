import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		String s = sc.next();
		s = s.replace(".", "");
		long bx100 = Integer.parseInt(s);

		long tmp = a * bx100;
		long res = tmp / 100;

		System.out.printf("%d", res);
	}
}