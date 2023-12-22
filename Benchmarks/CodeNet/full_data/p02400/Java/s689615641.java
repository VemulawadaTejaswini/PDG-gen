import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigDecimal r = new BigDecimal(scan.nextDouble());
		scan.close();
		BigDecimal pi = new BigDecimal(Math.PI);
		BigDecimal area = r.multiply(r).multiply(pi);
		BigDecimal length = r.multiply(new BigDecimal(2)).multiply(pi);
		System.out.println(area + " " + length);
	}
}