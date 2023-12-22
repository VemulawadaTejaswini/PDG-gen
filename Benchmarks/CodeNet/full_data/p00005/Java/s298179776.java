import java.util.Scanner;

public class Main {

	static Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		while (sc.hasNext()) {
			long a = sc.nextInt();
			long b = sc.nextInt();
			long x = a;
			long y = b;
			long max = y;
			while (x % y != 0) {
				max = x % y;
				x = y;
				y = max;
			}
			long min = a * b / max;
			System.out.println(max + " " + min);

		}

	}

}