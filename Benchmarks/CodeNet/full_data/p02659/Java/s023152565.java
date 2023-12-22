import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		//long[] a = new long[n];
		String s = "";
		double ml = a * b ;
		BigDecimal bd = new BigDecimal(String.valueOf(ml));

		BigDecimal bd1 = bd.setScale(0, RoundingMode.DOWN);

		s = bd1.toPlainString();


		sc.close();
			System.out.println(s);


	}

}
