import java.util.Scanner;
public class Main {
	public static void main( String[] args ) {
		Scanner sc = new Scanner( System.in ) ;
		int i = 1;
		int x = sc.nextInt() ;
		while( x != 0 ) {
			System.out.println( "Case " + i + " : " + x ) ;
			i++;
			x = sc.nextInt() ;
		}
	}
}