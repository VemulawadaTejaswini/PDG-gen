
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		BigDecimal three = BigDecimal.valueOf(3);
		BigDecimal maxlength = BigDecimal.valueOf(num).divide(three, 9, BigDecimal.ROUND_DOWN);
		System.out.println(maxlength.pow(3));
		
	}
}