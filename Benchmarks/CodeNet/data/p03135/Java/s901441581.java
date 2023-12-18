import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double T = Integer.parseInt(scanner.next());
		double X = Integer.parseInt(scanner.next());
		
		double ans = T / X;
		
		BigDecimal bigDecimal = new BigDecimal(ans);
		
		bigDecimal = bigDecimal.setScale(7,  BigDecimal.ROUND_HALF_UP);
		
		System.out.printf("%.7f", bigDecimal);
	}
}