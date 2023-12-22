import java.util.*;
import java.io.*;
import static java.lang.Math.*;

class Main {

    public static void main( final String[] args ) {

	final Scanner stdin = new Scanner( System.in );

	final int L = stdin.nextInt();
	final int A = stdin.nextInt();
	final int B = stdin.nextInt();
	final int C = stdin.nextInt();
	final int D = stdin.nextInt();

	System.out.println( L - Math.max( ( A - 1 ) / C, ( B - 1 ) / D ) - 1);	
    }    
}