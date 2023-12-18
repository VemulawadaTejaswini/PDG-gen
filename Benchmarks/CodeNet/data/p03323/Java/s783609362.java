import java.util.Scanner;

public class Main {
	  public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);

		   String a = scanner.next();
		   String b = scanner.next();
		   int A = Integer.parseInt(a);
		   int B = Integer.parseInt(b);
		   
		   if(A <= 8 && B <= 8)
		   {
			   System.out.println("Yay!");
		   }
		   else 
		   {
			   System.out.println(":(");
		   }
        	scanner.close();}
		  }