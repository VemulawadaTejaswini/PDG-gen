import java.util.Scanner;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
		int d = a/b;
		int r = a%b;
		double x = a;
		double y = b;
		double f = x/y;

		//1000000000 1

		//BigDecimal z = new BigDecimal(f);
		//BigDecimal z1 = z.setScale(4, BigDecimal.ROUND_HALF_UP);
		
		BigDecimal z = new BigDecimal(f);
		BigDecimal z1 = z.setScale(4, BigDecimal.ROUND_HALF_UP);

		System.out.print(d + " " + r + " ");
		System.out.printf("%.5f",z1);
	}

}