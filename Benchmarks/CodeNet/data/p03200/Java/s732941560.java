import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int l = s.length;
		long countB = 0;
		long ans = 0;
		for(int i = 0; i < l; i++) {
			if(s[i]=='W') {
				ans+=countB;
			}
			else {
				countB++;
			}
		}
		System.out.println(ans);
	 }
}