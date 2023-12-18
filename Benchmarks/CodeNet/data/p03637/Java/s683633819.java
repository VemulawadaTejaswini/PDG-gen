import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int N = scanner.nextInt();
		    int[] array = new int[N];
		    int count4 = 0;
		    int count2 = 0;
		    
		    for( int i = 0; i < N; i++ ) 
		    {
		    	array[i] = scanner.nextInt();
		    	if( array[i] % 4 == 0 ) 
		    	{
		    		count4++;
		    	}
		    	else 
		    	{
		    		if( array[i] % 2 == 0 ) 
		    		{
		    			count2++;
		    		}
		    	}
		    }
		    if( N % 2 == 0 ) 
		    {
		    	if( count4 * 2 + count2 >= N ) 
		    	{
		    		System.out.println("Yes");
		    	}
		    	else 
		    	{
		    		System.out.println("No");
		    	}
		    }
		    else 
		    {
		    	if( count2 == 0 ) 
		    	{
		    		if( count4 >= N/2 ) 
		    		{
		    			System.out.println("Yes");
		    		}
		    		else 
		    		{
		    			System.out.println("No");
		    		}
		    	}
		    	else if(count2 == 1)
		    	{
		    		if( count4 + 3 >= N /2 + 2 ) 
		    		{
		    			System.out.println("Yes");
		    		}
		    		else 
		    		{
		    			System.out.println("No");
		    		}
		    	}
		    	else 
		    	{
		    		if( count4 * 2 + count2 >= N )
		    		{
		    			System.out.println("Yes");
		    		}
		    		else 
		    		{
		    			System.out.println("No");
		    		}
		    	}
		    	
		    }
		    scanner.close(); }
		  }