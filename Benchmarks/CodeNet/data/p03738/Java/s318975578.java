import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  BigDecimal A = sc.nextBigDecimal();
	  BigDecimal B = sc.nextBigDecimal();
	  int c = A.compareTo(B);
	  if(c==0) {
		  System.out.print("EQUAL");
	  }
	  else if(c>0) {
		  System.out.print("GREATER");
	  }
	  else {
		  System.out.print("LESS");
	  }
	  sc.close();
    }
}