import java.util.Scanner;

class Main
{
	public static void main ( String[] args ) {
		Scanner sc = new Scanner ( System.in );

		int a = sc.nextInt ();
		int b = sc.nextInt ();
		int c = sc.nextInt ();
		int tmp = 0;

		for ( int i = 0; i < 3; i++ ) {
		if ( c < b ) {
			tmp = c;
			c = b;
	} else if ( tmp < a ) {
			b = a;
			a = tmp;
	} else if ( c < a ) {
			tmp = c;
			c = a;
			a = tmp;
	}
		}
		System.out.println ( a + " " + b + " " + c );
	}
}