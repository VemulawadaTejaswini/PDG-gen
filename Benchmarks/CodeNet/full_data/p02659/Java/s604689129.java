import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);

		long A = sc.nextLong();
		double B = sc.nextDouble();

		BigDecimal bA = new BigDecimal(A);
		BigDecimal bB = new BigDecimal(B);
		bB= bB.setScale(2, BigDecimal.ROUND_UP); //四捨五入小数第3位切り上げ。
		BigDecimal pop = bA.multiply(bB); //掛け算

		pop = pop.setScale(0, BigDecimal.ROUND_DOWN);

		System.out.println(pop);
	}
}