import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = Integer.parseInt( sc.nextLine() );
		final String S = sc.nextLine();
		int result = 0;
		for( int i = 1; i < size; i++ ) {
			if( S.charAt(i-1) == '#' && S.charAt(i) == '.' ) {
				result++;
			}
		}
		System.out.println( result);
	    
		sc.close();
	}
}
