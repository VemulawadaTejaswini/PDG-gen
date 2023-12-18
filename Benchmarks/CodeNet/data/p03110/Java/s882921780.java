import java.math.BigDecimal;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		BigDecimal ans = new BigDecimal("0");

		int i;
		String x,u;
		BigDecimal temp;
		for(i = 0; i < n; i++) {
			x = scan.next();
			u = scan.next();
			temp = new BigDecimal(x);
			if(u.equals("BTC")) {
				temp = temp.multiply(new BigDecimal("380000.0"));
			}
			ans = ans.add(temp);
		}
		System.out.println(ans.toString());
	}
}
