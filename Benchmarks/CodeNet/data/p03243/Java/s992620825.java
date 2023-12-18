import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n > n/100*111 ) {
			System.out.println((n / 100 + 1) * 111);
		} else {
			System.out.println(n / 100 * 111);
		}

	}
}