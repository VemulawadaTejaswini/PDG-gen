import java.util.*;
import java.io.*;

public class Main{
	public static boolean isInteger( String input ) { //Pass in string
    	try { //Try to make the input into an integer
        	Integer.parseInt( input );
        	return true; //Return true if it works
    	}
    	catch( Exception e ) { 
        	return false; //If it doesn't work return false
    	}
	} 

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		
		String[] tokens = s.split("-");

		if(tokens.length == 2){
			if(isInteger(tokens[0]) && isInteger(tokens[1]))
				System.out.println("Yes");
			else
				System.out.println("No");
		}else{
			System.out.println("No");
		}
	}
}
