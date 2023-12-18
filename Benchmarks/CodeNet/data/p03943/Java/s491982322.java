import java.util.Arrays;
import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int[] array = new int[3];
		    array[0] = scanner.nextInt();
		    array[1] = scanner.nextInt();
		    array[2] = scanner.nextInt();
		    
		    Arrays.sort(array);
		    
		    if( array[0] + array[1] == array[2] ) 
		    {
		    	System.out.println("Yes");
		    }
		    else 
		    {
		    	System.out.println("No");
		    }
		    
		    scanner.close(); }
		  }