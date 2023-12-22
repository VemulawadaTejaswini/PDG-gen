import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			String a = sc.next();
			String b = sc.next();
			
			BigDecimal bigA = new BigDecimal(a);
			BigDecimal bigB = new BigDecimal(b);
			
			
			BigDecimal c = bigA.multiply(bigB);
			
			long ans = c.longValue();
			
			System.out.println(ans);
		}
	}

}