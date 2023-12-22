import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int l = s.length();
		String ans = "";
		for(int i = 0; i < l; i++) {
			if(s.charAt(i)=='?') {
				ans += 'D';
			}
			else {
				ans += s.charAt(i);
			}
		}
		System.out.println(ans);
	 }
}
