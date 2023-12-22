import java.math.BigDecimal;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		double B = sc.nextDouble();
		BigDecimal bd = new BigDecimal(A);
		BigDecimal bd2 = new BigDecimal(B);
		BigDecimal bd3 = bd.multiply(bd2);
		BigDecimal bd4 = bd3.setScale(0, BigDecimal.ROUND_DOWN);
		System.out.println(bd4);
	}
}