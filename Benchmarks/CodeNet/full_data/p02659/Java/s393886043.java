import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		
		long a = scan.nextLong();
		double b = scan.nextDouble();
		 
		BigDecimal a1 = new BigDecimal(a);
		BigDecimal b1 = new BigDecimal(b);
		
		long answer = a1.multiply(b1).longValue();
		
		long ans = (long) (a * (b * 100) / 100);
		
		System.out.println(answer);
		
		}

}
