import java.math.BigDecimal;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		long a = stdIn.nextLong();
		long b = stdIn.nextLong();
		long c = stdIn.nextLong();
		
		BigDecimal f = BigDecimal.valueOf(4*a*b);
		BigDecimal e = BigDecimal.valueOf((c*c)-(a*c)-(b*c)-(a*c)+(a*a)+(a*b)-(b*c)+(a*b)+(b*b));
		
		if(f.compareTo(e) < 1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}



	}

}
