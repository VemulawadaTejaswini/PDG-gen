import java.util.Arrays;
import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int N = scanner.nextInt();
		    int[] hoge = new int[2 * N];
		    int count = 0;
		    
		    for( int i = 0; i < 2*N; i++) 
		    {
		    	hoge[i] = scanner.nextInt();
		    }
		    
		    Arrays.sort(hoge);
		    
		    for( int i = 0; i < N; i++) 
		    {
		    	count = count + hoge[2*i];
		    }
		    
		    System.out.println(count);
		    
		    scanner.close(); }
		  }