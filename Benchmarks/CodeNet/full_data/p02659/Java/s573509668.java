import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
// A - Multiplication 1
class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		BigDecimal A = sc.nextBigDecimal();

		BigDecimal B = sc.nextBigDecimal();

		BigDecimal w = A.multiply(B);

		BigDecimal ans = w.setScale(0, RoundingMode.DOWN);


		System.out.println(ans);
	}
}