import java.math.BigDecimal;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        long  sei  = sc.nextLong();
		        double syou = sc.nextDouble();

		        BigDecimal B_syou = new BigDecimal(syou);
		        B_syou = B_syou.setScale(2, BigDecimal.ROUND_DOWN);
		        BigDecimal B_sei = new BigDecimal(sei);

		        BigDecimal total = B_sei.multiply(B_syou);
		        System.out.println(total);

		        total = total.setScale(0, BigDecimal.ROUND_DOWN);

		        //long Total = (long)Math.floor(total);

		        System.out.println(total);
	}
}