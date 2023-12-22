import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			if ( ( i + 1 ) % 3 == 0 ) {
				System.out.print(" " + (i + 1) );
				continue;
			}

			if ( ( i + 1 ) % 10 == 3 ) {
				System.out.print(" " + (i + 1) );
			}

		}
		System.out.println();
		sc.close();

	}

}
