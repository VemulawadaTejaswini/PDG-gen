
import java.util.Scanner;

public class Main {
	
	public static void main( String[]args ){
		
		Scanner sc = new Scanner( System.in );
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int x = 1;
		
		for( int i = a;i <= b;i++ ){
			x *= i;
		}
		
		if( x > 0 )
			System.out.println("Positive");
		else if( x < 0 )
			System.out.println("Negative");
		else if( x == 0 )
			System.out.println("Zero");
		
	}

}
