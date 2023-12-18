import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			String line = stdin.next();
			System.out.print(line.charAt(i));
		}
	}

}
