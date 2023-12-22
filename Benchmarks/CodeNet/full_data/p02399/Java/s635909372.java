import java.math.BigDecimal;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		int a,b;
		double db,dbb;

		Scanner scan = new Scanner(System.in);

		a = scan.nextInt();
		b = scan.nextInt();

		db = 1.d * a/b;

		dbb = new BigDecimal(String.valueOf(db) ).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();

		System.out.println(a/b + " " + a%b + " "+ dbb);
		scan.close();
	}
}