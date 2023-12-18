import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		
		BigDecimal bd1 = new BigDecimal(L*L*L/27);

		
		System.out.println(bd1);
	}
}