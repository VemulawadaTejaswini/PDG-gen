import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] memo = new int[100000];
		int ans = 0;
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			memo[a-1]++;
			ans+=a;
		}
		int q = sc.nextInt();
		int b[] = new int[q];
		int c[] = new int[q];
		for(int i = 0; i < q; i++) {
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		for(int i = 0; i < q; i++) {
			ans+=((c[i]-b[i])*memo[b[i]-1]);
			memo[c[i]-1]+=memo[b[i]-1];
			memo[b[i]-1]=0;
			System.out.println(ans);
		}
	}
}