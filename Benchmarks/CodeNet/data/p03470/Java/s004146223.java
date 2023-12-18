import java.util.Arrays;
import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		   
			int N = scanner.nextInt();
			int[] mochi = new int[N];
			int counter = 1;
			
			for(int i = 0; i < N; i++) 
			{
				mochi[i] = scanner.nextInt();
			}
		    Arrays.sort(mochi);
		    for(int i = 1; i < N; i++) 
			{
				if(mochi[i] == mochi[i - 1] ) 
				{
					counter++;
				}
			}
			System.out.println(counter);
		    
		    scanner.close(); }
		  }