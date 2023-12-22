import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		int i = 0;

		while( true ) {
		Scanner sc = new Scanner(System.in);

		i++;

		int x = sc.nextInt();

		if( x == 0 || i > 10000 ) {
			break;
		}

		System.out.println("Case " + i + ": " + x);

		}
	}
}
