import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    String a = scanner.next();
		    String b = scanner.next();
		    String c = scanner.next();
		    
		    
		    if(a.substring(a.length()-1).equals(b.substring(0, 1)) 
		    		&&
		    	b.substring(b.length()-1).equals(c.substring(0, 1))) 
		    {
		    	System.out.println("YES");
		    }
		    else
		    {
		    	System.out.println("NO");
		    }	
		    
		    scanner.close(); }
		  }