import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.print((double) w * h / 2);
		if (!(w == x * 2 && h == y * 2)) {
			System.out.print(" 0");
		} else {
			System.out.print(" 1");
		}
	}
}