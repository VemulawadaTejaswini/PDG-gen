import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int result = 700;
		for (int i = 0; i < 3; ++i) {
			if (input.charAt(i) == 'o') {
				result += 100;
			}
		}
		System.out.println(result);
		in.close();
	}

}
