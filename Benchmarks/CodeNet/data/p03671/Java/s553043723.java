import java.util.Scanner;


public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		   
		    int A = scanner.nextInt();
		    int B = scanner.nextInt();
		    int C = scanner.nextInt();
		    
		    if(A <= C && B <= C)
		    {
		    	System.out.println(A + B);
		    }
		    else if(A <= B && C <= B)
		    {
		    	System.out.println(A + C);
		    }
		    else
		    {
		    	System.out.println(C + B);
		    }
		    scanner.close();}
		  }