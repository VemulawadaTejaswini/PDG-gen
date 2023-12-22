import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = Integer.parseInt(sc.nextLine());

		while (amount > 0) {
			amount -= 1000;
		}

		System.out.println(Math.abs(amount));

	}
}
