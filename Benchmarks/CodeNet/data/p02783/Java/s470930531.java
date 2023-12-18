import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigDecimal H = sc.nextBigDecimal();
		BigDecimal A = sc.nextBigDecimal();
		BigDecimal ans = H.divide(A);
		System.out.println(ans.setScale(0, RoundingMode.CEILING));
		sc.close();
	}
	
}