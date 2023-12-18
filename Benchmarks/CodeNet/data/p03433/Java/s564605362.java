import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int b = sc.nextInt() % 500;

		if (b <= sc.nextInt()) {
			 System.out.print("YES");
		} else {
			 System.out.print("NO");
		}
	}

}
