import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		BigDecimal r = new BigDecimal(Integer.parseInt(s));
		BigDecimal p = new BigDecimal(Math.PI);

		BigDecimal a = new BigDecimal(0);
		BigDecimal b = new BigDecimal(0);
		BigDecimal c = new BigDecimal(2);
		a = p.multiply(r).multiply(r);
		b = p.multiply(r).multiply(c);

		System.out.print(a);
		System.out.print(" ");
		System.out.println(b);
	}

}