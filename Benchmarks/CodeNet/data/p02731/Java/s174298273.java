//package atcoder;
 
import java.util.*;
import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		BigDecimal ans = new BigDecimal(Math.pow(L/3, 3));
		System.out.println(ans);
	}
}