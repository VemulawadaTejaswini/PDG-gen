import java.util.Arrays;
import java.util.Scanner;

public class Main1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0)break;
			
			int[] p = new int[n];
			for(int i=0;i<n;i++) {
				p[i] = sc.nextInt();
			}
			
			int[] q = new int[((n+2)*(n+1))/2];	//!!!!
			int r = 0;
			for(int i = 0;i<=n;i++) {
				for(int j=i;j<=n;j++) {
					q[r++] = p[i]+p[j];
				}
			}
			Arrays.sort(q);
			
			long s = 0;
			for(int i=0;i<q.length;i++) {
				if(m-q[i] < 0)continue;
				if(r >= 0)s = Math.max(s,q[i]+q[r]);
			}
			System.out.println(s);
			
		}
	}
}

