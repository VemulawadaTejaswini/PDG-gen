import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] ss = s.split(" ");
		int a = Integer.parseInt(ss[0]);
		int b = Integer.parseInt(ss[1]);

		BigDecimal aa = new BigDecimal(ss[0]);
		BigDecimal bb = new BigDecimal(ss[1]);
		
		BigDecimal ff = aa.divide(bb,6,BigDecimal.ROUND_HALF_UP);

		System.out.print(a / b);
		System.out.print(" ");
		System.out.print(a % b);
		System.out.print(" ");
		System.out.println(ff);

	}

}