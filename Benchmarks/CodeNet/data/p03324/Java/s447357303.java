import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();

		String[] lines = line.split(" ");

		long a = Long.parseLong(lines[0]);
		long b = Long.parseLong(lines[1]);

		long result = b;
		for (long i = 0; i < a; i++) {
			result = result * 100L;
		}
		System.out.println(result);
	}
}
