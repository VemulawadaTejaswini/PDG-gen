import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		int l = sca.nextInt();

		double i = l/3.0;
		double j = l/3.0;
		double k = l/3.0;
		double max = i*j*k;
		BigDecimal bd = new BigDecimal(max);

		System.out.println(bd.setScale(8, RoundingMode.DOWN));

		// 後始末
		sca.close();
	}
}