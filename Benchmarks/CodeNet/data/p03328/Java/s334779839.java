import java.util.Scanner;

public class Main {
	  public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);

		    String a = scanner.next();
		    String b = scanner.next();
		    int A = Integer.parseInt(a);
		    int B = Integer.parseInt(b);
		    int N = B - A;
		    int Height = ( N * N + N )/2;
		    int Depth = Height - A ;
		    
		    System.out.println(Depth);
		    
        	scanner.close();}
		  }