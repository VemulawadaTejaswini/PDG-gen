import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		scanner.hasNext();

		float r = scanner.nextInt();

		float circle = r * r * (float)Math.PI;

		String ans = String.format("%.6f", circle);

		System.out.println(ans + " " + ans);

	}
}