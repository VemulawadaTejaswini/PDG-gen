import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();

		String[] lines = line.split(" ");

		int a = Integer.parseInt(lines[0]);
		int b = Integer.parseInt(lines[1]);

		int result = b;
		for (int i = 0; i < a; i++) {
			result = result * 100;
		}
		System.out.println(result);
	}
}
