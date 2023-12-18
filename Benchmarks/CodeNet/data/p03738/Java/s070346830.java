

  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	BigDecimal A = in.nextBigDecimal();
	BigDecimal B = in.nextBigDecimal();

	if(A.compareTo(B) > 0) System.out.println("GREATER");
	if(A.compareTo(B) == 0) System.out.println("EQUAL");
	if(A.compareTo(B) < 0) System.out.println("LESS");

	in.close();

	}
}