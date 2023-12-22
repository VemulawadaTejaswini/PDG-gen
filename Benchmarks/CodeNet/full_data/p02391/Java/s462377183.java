import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String[] b = x.split(" ");
		int a = Integer.parseInt(b[0]);
		int c = Integer.parseInt(b[1]);
		if (a > c) {
			System.out.println("a > b");

		}
		if (a < c) {
			System.out.println("a < b");

		}
		if (a == c) {
			System.out.println("a == b");

		}

	}
}