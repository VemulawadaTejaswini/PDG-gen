import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ", 0);

		BigDecimal a = new BigDecimal(line[0]);
		BigDecimal b = new BigDecimal(line[1]).multiply(BigDecimal.valueOf(100));
		BigDecimal ans = a.multiply(b).divide(BigDecimal.valueOf(100));

		System.out.println(ans.setScale(0, RoundingMode.DOWN));
	}
}