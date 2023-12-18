import java.util.Scanner;

public class Main{

  public static void main(String...s)
  {
  		Scanner ob = new Scanner(System.in);
  		int A = Integer.parseInt(ob.nextLine());
  		int B = Integer.parseInt(ob.nextLine());
  
  		if(A <= 2*B)
    	System.out.println("0");
  		else
    	System.out.println(A-2*B);
  }
}