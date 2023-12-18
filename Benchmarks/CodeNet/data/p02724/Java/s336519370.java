import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		int num = scan.nextInt();

		int result = (num / 500) * 1000 + (num % 500) / 5 * 5;

		System.out.println(result);
	}
}