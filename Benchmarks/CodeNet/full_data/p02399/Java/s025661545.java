import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int d = a / b;
		int r = a % b;
		double f = (double)a / (double)b;
        BigDecimal BD = new BigDecimal(f);
		
		System.out.println(d + " " + r + " " + BD);
	}
}