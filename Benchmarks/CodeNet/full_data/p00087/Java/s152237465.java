import java.util.Scanner;
import java.util.Stack;


public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while( sc.hasNextLine() ) {
			String input[] = sc.nextLine().split(" ");
			
			Stack<Double> a = new Stack<Double>();
			int i = 0;
			while ( input.length > i ) {
				if ( !Character.isDigit( input[i].charAt(0) ) && input[i].toCharArray().length == 1 ) {
					char c = input[i].charAt(0);
					Double pop1 = a.pop();
					Double pop2 = a.pop();
					if ( c == '+' ) {
						a.push( pop2 + pop1 );
					} else if ( c == '-' ) {
						a.push( pop2 - pop1 );
					} else if ( c == '*' ) {
						a.push( pop2 * pop1 );
					} else if ( c == '/' ) {
						a.push( pop2 / pop1 );
					}
				} else {
					a.push( Double.valueOf( input[i] ) );
				}
				
				i++;
			}
			System.out.println( a.pop() );
		}
	}
	

}