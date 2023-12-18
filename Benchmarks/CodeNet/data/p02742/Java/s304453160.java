import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long H = sc.nextLong();
		long W = sc.nextLong();

		BigDecimal bd = new BigDecimal(H * W);
		if( H == 1 || W == 1) {
			System.out.println(0);
		} else if(bd.remainder(new BigDecimal(2)).intValue() == 0) {
			System.out.println(H * W / 2);
		} else {
			System.out.println((H * W / 2) + 1);
		}
	}
}