import java.util.Scanner;

public class Main {
	  public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    int N = scanner.nextInt();
		    int array[] = new int[N];
		    int count = 0;
		    
		    
		    for(int i = 0; i < N ; i++)
		    {
		    	array[i] = scanner.nextInt();
		    }
		    for(int i = 0; i < N - 1; i++) 
		    {
		    	if(array[i] == array[ i + 1 ]) 
		    	{
		    		count = count + 1 ;
		    		i = i + 1;

		    	}
		    	else 
		    	{
		    		//何もしない
		    	}
		    }
		    System.out.println(count);
		    scanner.close();}
		  }