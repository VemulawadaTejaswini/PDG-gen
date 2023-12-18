import java.util.Scanner;


public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    String S = scanner.nextLine();
		    String T = S;
		   int N = S.length();

		    if(S.indexOf("A") == 0) 
		    {
		    	if(S.indexOf("C") >= 2 && S.indexOf("C") <= N - 2 ) 
		    	{
		    		S = S.toUpperCase();
		    	
		    		S = S.substring(0,1)+S.substring(1).toLowerCase();
		    		
		    		S = S.substring(0,S.indexOf("c"))+S.substring(S.indexOf("c")).toUpperCase();
		    		
		    		S = S.substring(0,S.indexOf("C")+1)+S.substring(S.indexOf("C")+1).toLowerCase();
		  
		    		if( S.equals(T) ) 
		    		{
		    			System.out.println("AC");
		    		}
		    		else 
		    		{
		    			System.out.println("WA");
		    		}
		    	}
		    	else 
		    	{
		    		System.out.println("WA");
		    	}
		    }
		    else 
		    {
		    	System.out.println("WA");
		    }
		    
		    
		    scanner.close();}
		  }
