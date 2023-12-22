import java.util.Scanner;

public class Main {

	static Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x = a;
			int y = b;
			int max;
			while ((max = x % y) != 0) {
				x = y;
				y = max;
			}
			int min = a * b / max;
			System.out.println(max + " " + min);

		}

	}

}