import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		?????? r ???????????¢?????¨?????¨?????????????±???????????????°?????????????????????????????????

		double r = Double.parseDouble(scan.next());

		double area = r * r * Math.PI;
		double length = 2 * r * Math.PI;

		double af_area = new BigDecimal(String.valueOf(area)).setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue();
		double af_length = new BigDecimal(String.valueOf(area)).setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue();

		System.out.println(af_area + " "+ af_length);

	}
}