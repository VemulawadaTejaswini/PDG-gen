import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int inN = stdin.nextInt();
		int inA = stdin.nextInt();

		String result = "No";
		if ((inN % 500) <= inA) {
			result = "Yes";
		}

		System.out.println(result);
	}

}
