import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	Scanner stdin = new Scanner(System.in);

	while ( stdin.hasNextLine() ) {

	    final String[] input = stdin.nextLine().split(",");
	    final double weight = Double.parseDouble( input[1] );
	    final double height = Double.parseDouble( input[2] );
	    if ( weight / ( height * height ) >= 25 ) {
		System.out.println( input[0] );
	    }	    
	}
	
    }
    
}