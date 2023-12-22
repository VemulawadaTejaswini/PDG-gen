
import java.util.*;
import java.math.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal a = new BigDecimal(sc.next());
		BigDecimal b = new BigDecimal(sc.next());
		BigDecimal ans = b.multiply(a);
		
		System.out.println(ans);
		sc.close();
	}
 
}