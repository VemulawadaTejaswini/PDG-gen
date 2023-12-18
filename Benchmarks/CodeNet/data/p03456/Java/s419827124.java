import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(Math.sqrt(Double.parseDouble(String.valueOf(scanner.nextInt()) + String.valueOf(scanner.nextInt()))) % 1 == 0.0 ? "Yes" : "No");
		scanner.close();
	}

}
