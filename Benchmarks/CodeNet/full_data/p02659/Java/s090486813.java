import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			double A = scan.nextDouble();
			double B = scan.nextDouble();
			
			BigDecimal s = new BigDecimal(A*B);
			
			
			
		
			System.out.println(s.longValue());
			
			
			
			
			
			
		}
		
		
	}
		

}
