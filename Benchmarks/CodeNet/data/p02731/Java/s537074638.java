import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		sc.close();

		BigDecimal three = new BigDecimal("3");
		BigDecimal bigL = new BigDecimal(String.valueOf(l));
		BigDecimal len = bigL.divide(three, 8, RoundingMode.HALF_UP);

		BigDecimal answer = len.multiply(len).multiply(len);

		print(answer);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
