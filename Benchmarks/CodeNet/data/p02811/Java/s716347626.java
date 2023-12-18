import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int K = scan.nextInt();
		int X = scan.nextInt();

		if(500 * K  >= X) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		System.out.println();

	}
}