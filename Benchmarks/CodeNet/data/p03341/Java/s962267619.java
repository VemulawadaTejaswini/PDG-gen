// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str = in.next();
		
		int s = str.length();
		
		int ans = 300000;
		
		int e = 0;
		
		for(int i=0;i<s;i++){
		   if( str.charAt(i)=='E' ) e++;
		}
		
		int w = 0 ;
		
		for(int i=0;i<s;i++){
		    
		    if( str.charAt(i)=='E' ) e--;
		    
		    ans = Math.min(ans,w+e);
		    
		    
		    if( str.charAt(i)=='W' ) w++;
		}
	
		System.out.print(ans);
	}
}