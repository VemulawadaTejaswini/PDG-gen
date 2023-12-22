package contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
	    ArrayList<Integer> Al = new ArrayList<Integer>();
	    Scanner scan = new Scanner( System.in );
	    
		// Read in
	    for (int i = 0; i < 10; i++){
	    	int a = scan.nextInt();
	    	Al.add(a);
		}
	    
		// Quick Sort
	    Collections.sort(Al);
	    
		// Print first 3
	    Integer i = Al.size() - 1;
	    Integer numOfElements = 3;
	    while (i >= Al.size()-numOfElements){
	    	System.out.println(Al.get(i));
	    	i--;
	    }
	}
}