import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (sc.hasNext()) {
			int n = sc.nextInt();

			int ans = (n * n / 2) + (n / 2) + 2;

			System.out.println(ans);
		}

	}

}