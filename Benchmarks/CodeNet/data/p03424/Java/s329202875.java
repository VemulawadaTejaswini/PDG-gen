import java.util.Scanner;


public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		  
		    int N = scanner.nextInt();
		    String[] array = new String[N];
		    int counter  = 0;
		    int j = 0;
		    
		    for(int i = 0; i < N; i++)
		    {
		    	array[i] = scanner.next();
		    }
		    while(counter == 0 && j < N) 
		    {
		    	if(array[j].equals("Y")) 
		    	{
		    		System.out.println("Four");
		    	}
		    	counter = counter + 1;
		    	j++;
		    }
		    if(counter == 0) 
		    {
		    	System.out.println("Three");
		    }
		    scanner.close();}
		  }