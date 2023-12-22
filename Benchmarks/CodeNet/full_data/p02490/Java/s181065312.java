import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, cash;
		x = sc.nextInt();
		y = sc.nextInt();
		while (x != 0 || y != 0) {
			if (x > y) {
				cash = x;
				x = y;
				y = cash;
			}
			System.out.println(x+" "+y);
			x = sc.nextInt();
			y = sc.nextInt();
		}
	}
}