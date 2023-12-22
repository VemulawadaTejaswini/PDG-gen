import java.util.*;
import java.io.*;

class Pair {
    final int id;
    final double BMI;

    public Pair( double weight, double height, int id ) {
	this.id = id;
	BMI = weight / ( height * height ) * 10000.0;
    }
}

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);

	while ( true ) {

	    final int n = stdin.nextInt();
	    if ( n == 0 ) {
		break;
	    }

	    Pair maxPair = new Pair(1000000, 1, -1);

	    for ( int i = 0; i < n; i++ ) {
		final int id = stdin.nextInt();
		final int height = stdin.nextInt();
		final int weight = stdin.nextInt();

		final Pair p = new Pair( weight, height, id );
		if ( Math.abs( maxPair.BMI - 22.0 ) > Math.abs( p.BMI - 22.0 ) ) {
		    maxPair = p;
		}		
	    }	    

	    System.out.println( maxPair.id );
	    
	}
	
    }
    
}