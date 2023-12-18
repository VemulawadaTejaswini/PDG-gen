import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int N = scanner.nextInt();
		    
		    System.out.println(  (long)Math.pow( 2, N-1 ) );
		    
		    scanner.close(); }
		  }