import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n = 0;
		int x = 0;
		int cnt = 0;
		
		Scanner sc= new Scanner( System.in );

		while ( true ) {
			n = sc.nextInt();
			x = sc.nextInt();

			if ( n == 0 && x == 0 ) {
				break;
			}

			for ( int i = 1 ; i < ( n - 1 ) ; i++ ) {
				for  ( int j = ( i + 1 ) ; j < n ; j++ ) {
					for ( int k = ( j + 1 ) ; k < ( n + 1 ) ; k++ ) {
						if ( ( i + j + k ) == x ) {
							cnt++;
						}
					}
				}

			}
			System.out.println( cnt );
		}
		sc.close();
	}
}
