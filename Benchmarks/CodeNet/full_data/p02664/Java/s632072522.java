import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int l = s.length();
		char[] str = s.toCharArray();
		String ans = "";
		for(int i = 0; i < l; i++) {
			if(str[i]=='?') {
				ans += 'D';
			}
			else {
				ans += str[i];
			}
		}
		System.out.println(ans);
	 }
}
