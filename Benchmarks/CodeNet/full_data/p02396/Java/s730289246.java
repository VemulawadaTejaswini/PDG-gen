import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int i = 0;
		Scanner sc;
		
		while( true ) {
		sc = new Scanner(System.in);

		i++;

		int x = sc.nextInt();

		if( x == 0 ) break;

		System.out.println("Case " + i + ": " + x);


		}
		sc.close();
	}
}
