import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);
	boolean second = false;
	while ( stdin.hasNext() ) {

	    if ( second ) {
		System.out.println();
	    }
	    
	    int n = stdin.nextInt();
	    final int[] digit = new int[5];

	    for ( int i = 0; i < digit.length; i++ ) {
		digit[i] = n % 10;
		n /= 10;
	    }

	    for ( int i = 4; i >= 0; i-- ) {
		if ( digit[i] < 5 ) {
		    System.out.print("*");
		} else {
		    System.out.print(" ");
		}
	    }
	    System.out.println();

	    for ( int i = 4; i >= 0; i-- ) {
		if ( digit[i] >= 5 ) {
		    System.out.print("*");
		} else {
		    System.out.print(" ");
		}
	    }
	    System.out.println();
	    
	    for ( int i = 4; i >= 0; i-- ) {
		System.out.print( "=" );
		if ( digit[i] >= 5 ) {
		    digit[i] -= 5;
		}
	    }
	    System.out.println();

	    for ( int i = 0; i < 5; i++ ) {
		for ( int j = 4; j >= 0; j-- ) {
		    if ( digit[j] == i ) {
			System.out.print( " " );			
		    } else {
			System.out.print( "*" );
		    }
		}
		System.out.println();
	    }
	    second = true;
	}
	
    }
    
}