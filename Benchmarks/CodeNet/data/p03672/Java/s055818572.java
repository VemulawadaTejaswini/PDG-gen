import java.util.Scanner;


public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		   
		    String S = scanner.nextLine();
		    for(int i = 1; i < S.length(); i++) 
		    {
		    	S = S.substring(0,S.length() - 1 );
		    	if(S.length() % 2 == 0)
		    	{
		    		String T = S.substring(0, S.length() / 2 );
		    		String U = S.substring(S.length()/2);
		    		
		    		if( T.equals(U) ) 
		    		{
		    			System.out.println(i);
		    		}
		    	}
		    }
		    		
		    scanner.close();}
		  }