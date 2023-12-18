import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    
		    int N = scanner.nextInt();
		    int M = scanner.nextInt();
		    int[][] fune = new int[2][M];
		    int count = 0;
		    
		    for( int i = 0; i < M; i++ ) 
		    {
		    	fune[0][i] = scanner.nextInt();
		    	fune[1][i] = scanner.nextInt();
		    }
		    
		    //1~k,k~Nが一つでも存在すればよい。
		    for( int k = 0; k < N; k++ )
		    {
		    	for(int j = 0; j < M; j++) 
		    	{
		    		for(int l = 0; l < M; l++) 
		    		{
		    			if( fune[0][j] == 1 && fune[1][j] == k 
		    					&& fune[0][l] == k && fune[1][l] == N ) 
		    			{
		    				count++;
		    			}
		    		}
		    	}
		    }
		    if(count != 0) 
		    {
		    	System.out.println("POSSIBLE");
		    }
		    else 
		    {
		    	System.out.println("IMPOSSIBLE");
		    }
		    
		    scanner.close(); }
		  }