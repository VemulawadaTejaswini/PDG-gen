import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int m = 0;
		int f = 0;
		int r = 0;
		String record ="";

		Scanner sc= new Scanner(System.in);

		while ( true ) {
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();

			if ( m == -1 && f == -1 && r == -1 ) {
				break;
			}

			if ( m == -1 || f == -1) {
				record ="F";
			} else if( ( m + f ) >= 80 ) {
				record ="A";
			} else if( ( m + f ) >= 65 ) {
				record ="B";
			} else if( ( m + f ) >= 50 ) {
				record ="C";
			} else if( ( m + f ) >= 30 ) {
				record ="D";
				if( r >= 50 ) {
					record ="C";
				}
			} else {
				record ="F";
			}
			System.out.println( record );
		}
		sc.close();
	}
}
