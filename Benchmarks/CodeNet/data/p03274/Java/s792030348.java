import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int N  = scanner.nextInt();
		    int K = scanner.nextInt();
		    
		    int[] rousoku = new int[N];
		    
		    for(int i = 0; i < N; i++) 
		    {
		    	rousoku[i] = scanner.nextInt();
		    }
		    
		    int min = rousoku[K-1] - rousoku[0]+(int)Math.abs(rousoku[0]);
		    for(int j = 0;  K + j <= N; j++ )
		    {
		    	if( rousoku[K+j-1] - rousoku[j]+(int)Math.abs(rousoku[j]) < min)
		    	{
		    		min =  rousoku[K+j-1] - rousoku[j]+(int)Math.abs(rousoku[j]);
		    	}
		    }
		    
		    System.out.println(min);
		    
		    scanner.close(); }
		  }