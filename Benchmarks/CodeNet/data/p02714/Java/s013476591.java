import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String S = sc.next();
		char[] s = S.toCharArray();
		long ans = 0;
		long Rnum = 0;
		long Bnum = 0;
		long Gnum = 0;
		for(int i = 0; i < n; i++) {
			if(s[i] =='R') {
				Rnum++;
			}
			if(s[i] =='B') {
				Bnum++;
			}
			if(s[i] =='G') {
				Gnum++;
			}
		}
		ans+=Rnum*Bnum*Gnum;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				int k = 2*j-i;
				if(k<n&&s[i]!=s[j]&&s[j]!=s[k]&&s[k]!=s[i]) {
					ans--;
				}
			}
		}
		System.out.println(ans);
	}
}