
public class Main {
	public static void main(String[]args) {
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
	
		if ( a < b ) {
			System.out.print( "a < b ");
		} else if ( a > b ) {
			System.out.print( " a > b" );
		} else if ( a == b )
			System.out.print( "a == b ");
	}
}