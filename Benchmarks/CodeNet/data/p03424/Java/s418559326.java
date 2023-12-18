import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int N = scanner.nextInt();
		    String[] s = new String[N];
		    int truefalse = 0;
		    
		    for(int i = 0; i < N; i++) 
		    {
		    	s[i] = scanner.next();
		    	if( s[i].equals("Y") ) 
		    	{
		    		System.out.println("Four");
		    		truefalse++;
		    		break;
		    	}
		    }
		    if( truefalse == 0 ) 
		    {
		    	System.out.println("Three");
		    }
		    
		    scanner.close(); }
		  }