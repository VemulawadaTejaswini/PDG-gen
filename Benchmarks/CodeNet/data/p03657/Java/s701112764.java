import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		String result = ((A+B) >= 3) ? "Possible" : "Impossible";
		System.out.println(result);

	}

}