import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    int c = scanner.nextInt();
		    int d = scanner.nextInt();
		    
		    
		    
		    
		    if( Math.abs(b - a) <= d && Math.abs(c - b) <= d || Math.abs(c - a) <= d ) 
		    {
		    	System.out.println("Yes");
		    }
		    else
		    {
		    	System.out.println("No");
		    }
		    
		    scanner.close(); }
		  }