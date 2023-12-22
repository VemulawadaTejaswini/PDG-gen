import java.util.Scanner;

public class Main4 {

	static void print_ab( String str, int a, int b ) {
		System.out.println( str.substring( a, b+1 ) );
	}

	static String reverse_ab( String str, int a, int b ) {

		String rev_str = "";

		if ( a > 0 ) {
			rev_str = str.substring( 0, a );
		}

		for ( int i = b ; i > a-1 ; i-- ) {
			rev_str += str.charAt( i );
		}

		if ( b+1 < str.length() ) {
			rev_str += str.substring( b+1, str.length() );
		}

		return rev_str;
	}

	static String replace_ab( String str, int a, int b, String p_str ) {

		String rep_str = "";

		if ( a > 0 ) {
			rep_str = str.substring( 0, a );
		}

		rep_str += p_str;

		if ( b+1 < str.length() ) {
			rep_str += str.substring( b+1, str.length() );
		}

		return rep_str;
	}

	public static void main(String[] args) {

		int op_num = 0;
		int num1 = 0;
		int num2 = 0;

		String str = "";
		String p_str = "";
		String op = "";

		Scanner sc= new Scanner( System.in );

		str = sc.next();
		op_num = sc.nextInt();


		for ( int i = 0 ; i < op_num ; i++ ) {

			op = sc.next();

			switch(op) {
			case ("print"):
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				print_ab( str, num1, num2 );
				break;
			case ("reverse"):
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				str = reverse_ab( str, num1, num2 );
				break;
			case ("replace"):
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				p_str = sc.next();
				str = replace_ab( str, num1, num2, p_str );
				break;
			}
		}
		sc.close();
	}
}
