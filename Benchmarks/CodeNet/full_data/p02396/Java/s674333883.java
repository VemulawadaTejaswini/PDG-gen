import java.util.Scanner;
import java.io.*;


class Main {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    int i = 1;
	    while( true ){
	    	String s = sc.next();
	    	int x = Integer.parseInt(s);
	    	if( x == 0 ){
	    		break;
	    	}
	    	System.out.println("Case " + i + ": " + x );
	    	i++;
	    }
	}
}