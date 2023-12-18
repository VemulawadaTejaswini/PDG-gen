import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int b[] = new int[m];
		int c[] = new int[m];
		for(int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for(int i = 0; i < m; i++) {
			int time = b[i];
			int now = 0;
			while(now<time&&a[now]<c[i]) {
				a[now] = c[i];
				now++;
			}
			Arrays.sort(a);
		}
		long ans = 0;
		for(int i = 0; i < n; i++) {
			ans+=a[i];
		}
		System.out.println(ans);
	 }
}