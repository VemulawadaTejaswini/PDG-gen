import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal bd = sc.nextBigDecimal();
		bd = bd.multiply(sc.nextBigDecimal());
		BigInteger bi = bd.toBigInteger();
		System.out.println(bi.toString());
	}
}
