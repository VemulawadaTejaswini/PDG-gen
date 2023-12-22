import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		int result = amount + (int) Math.pow(amount, 2) + (int) Math.pow(amount, 3);
		System.out.println(result);
	}
}
