import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		BigDecimal x = new BigDecimal(sn.next());
		BigDecimal y = new BigDecimal(sn.next());
        System.out.println(x.multiply(y).intValue());
	}
}
