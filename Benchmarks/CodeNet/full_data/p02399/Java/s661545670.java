import java.math.BigDecimal;
import java.util.Scanner;
 
class Main{
 
	public static void main(String[] args) {

		int a,b;
		double db;

		Scanner scan = new Scanner(System.in);

		a = scan.nextInt();
		b = scan.nextInt();

		BigDecimal aa = new BigDecimal(a);
		BigDecimal bb = new BigDecimal(b);

		db = aa.divide(bb, 8, BigDecimal.ROUND_HALF_UP).doubleValue();

		System.out.println(a/b + " " + a%b + " "+ db);
		scan.close();
	}
}