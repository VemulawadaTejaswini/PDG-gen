import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	Scanner stdin = new Scanner(System.in);

	while ( stdin.hasNextInt() ) {
	    final int no = ( stdin.nextInt() - 1 ) % 39 + 1;
		System.out.printf( "3C%02d\n", no );
	}	
    }
    
}