import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int row = stdin.nextInt() - 2;
		int column = stdin.nextInt() - 2;

		System.out.println(Math.abs(row * column));
	}

}
