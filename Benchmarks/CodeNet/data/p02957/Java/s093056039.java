import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = sc.nextInt() + sc.nextInt();

		System.out.println(sum % 2 == 0 ? sum / 2 : "IMPOSSIBLE");
	}
}