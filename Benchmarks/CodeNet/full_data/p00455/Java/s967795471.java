import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	for ( int i = 0; i < 3; i++ ) {

	    int fromH = stdin.nextInt();
	    int fromM = stdin.nextInt();
	    int fromS = stdin.nextInt();

	    int toH = stdin.nextInt();
	    int toM = stdin.nextInt();
	    int toS = stdin.nextInt();

	    int s = 0;
	    int m = 0;
	    int h = 0;
	    
	    if ( toS < fromS ) {
		toM -= 1;
		toS += 60;
	    }
	    s = toS - fromS;

	    if ( toM < fromM ) {
		toH -= 1;
		toM += 60;
	    }
	    m = toM - fromM;
	    h = toH - fromH;

	    System.out.printf( "%d %d %d\n", h, m, s );	    
	}	
    }    
}