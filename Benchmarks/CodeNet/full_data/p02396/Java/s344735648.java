import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int i = 0;
		int x = 0;
		Scanner sc;

		while( true ) {
			sc = new Scanner(System.in);

			i++;

			x = sc.nextInt();

			if ( x == 0 ) break;

			System.out.println("Case " + i + ": " + x);
		}
		sc.close();
	}
}
