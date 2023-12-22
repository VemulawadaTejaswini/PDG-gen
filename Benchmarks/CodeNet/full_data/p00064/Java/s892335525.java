import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);
	final StringBuilder sb = new StringBuilder();
	
	while ( stdin.hasNextLine() ) {
	    sb.append( stdin.nextLine() );
	}

	final String input = sb.toString().replaceAll( "[^0-9]", " " );
	final Scanner ir = new Scanner( input );

	int sum = 0;
	while ( ir.hasNextInt() ) {
	    sum += ir.nextInt();
	}
	System.out.println( sum );
    }    
}