import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int w = input.nextInt();
		final int h = input.nextInt();
		final int x = input.nextInt();
		final int y = input.nextInt();
		final int r = input.nextInt();
		input.close();
		
		boolean isIn = (0 <= x-r) && (x + r <= w) && (0 <= y - r) && (y + r <= h);
		String answer = isIn ? "Yes" : "No";
		System.out.println(answer);
	}
}