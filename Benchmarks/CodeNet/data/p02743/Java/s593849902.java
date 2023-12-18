import java.math.BigDecimal;
import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			double A = sc.nextInt();
			double B = sc.nextInt();
			double C = sc.nextInt();
			
			BigDecimal a = BigDecimal.valueOf(A);
			BigDecimal b = BigDecimal.valueOf(B);
			BigDecimal c = BigDecimal.valueOf(C);
			
			BigDecimal left = a.multiply(b); 
			BigDecimal right = c.subtract(a).subtract(b);
			right = right.divide(BigDecimal.valueOf(2.0));
			right = right.multiply(right);
			
			if(left.compareTo(right)==-1) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
	    }
				
	}
	
