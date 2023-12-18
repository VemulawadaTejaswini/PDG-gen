import java.util.Arrays;
import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		   
			int N = scanner.nextInt();
			int[] kazu = new int [N];
			int[] kazusort = new int [N];
			
			for(int i = 0; i < N; i++) 
			{
				kazu[i] = scanner.nextInt();
				kazusort[i] = kazu[i];
			}
			
			Arrays.sort(kazusort);
			for(int i = 0; i < N; i++) 
			{
				if( kazu[i] > kazusort[N / 2 - 1] ) 
				{
					System.out.println(kazusort[N/2 - 1]);
				}
				else 
				{
					System.out.println(kazusort[N/2]);
				}
			}
		    scanner.close(); }
		  }