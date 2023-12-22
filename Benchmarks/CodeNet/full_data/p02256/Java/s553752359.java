import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		greatestCommonDivisor(x, y);

	}
	
	public static void greatestCommonDivisor(int x, int y) {
		while (y > 0) {
			int remainder = x % y;
			x = y;
			y = remainder;
		}
		System.out.println(x);
	}
}
