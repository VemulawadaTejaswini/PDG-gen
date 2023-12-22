import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		long a_sum[] = new long[n];
		long b_sum[] = new long[m];
		int ans = 0;
		
		
		a_sum[0] = scan.nextInt();
		for(int i=1;i<n;i++) {
			int a = scan.nextInt();
			a_sum[i] = a_sum[i-1]+a;
		}
		
		b_sum[0] = scan.nextInt();
		for(int i=1;i<m;i++) {
			int b = scan.nextInt();
			b_sum[i] = b_sum[i-1]+b;
		}
		
		for(int i=0;i<n;i++) {
			int read = 0;
			if(a_sum[i] > k) {
				break;
			}
			read += i+1;
			
			for(int j=0;j<m;j++) {
				if(a_sum[i] + b_sum[j] > k) {
					break;
				}else {
					read += 1;
				}
			}
			
			ans = Math.max(read, ans);
		}
		
		System.out.println(ans);
		
	}
}
 
