import java.math.BigDecimal;
import java.util.Scanner;
public class Main {


	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		long a = stdIn.nextLong();
		long b = stdIn.nextLong();
		long c = stdIn.nextLong();
		
		BigDecimal d = BigDecimal.valueOf(Math.sqrt(a));
		BigDecimal e = BigDecimal.valueOf(Math.sqrt(b));
		long f = d.multiply(e).longValue();
		
		if(f*2 < c - a- b){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}

}
