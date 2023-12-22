import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String ans = "";
		for(int i = 0; i < n; i++) {
			ans += "ACL";
		}
		System.out.println(ans);
	}
}