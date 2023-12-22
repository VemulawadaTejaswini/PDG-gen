import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[n];
		long[] b = new long[m];
		long min = 0;
		int as = 0;
		int bs = 0;
		for(int i =0; i < n; i++) {
			a[i] = sc.nextLong();
			if(i > 0) a[i]+=a[i-1];
			if(a[i]<=k)as = i+1;
		}
		for(int i = 0; i < m; i++) {
			b[i] = sc.nextLong();
			if(i > 0) b[i]+=b[i-1];
			if(b[i]<=k)bs = i+1;
		}
		//System.out.println(as);
		//System.out.println(bs);
		if(as==0&&bs==0) System.out.println(0);
		else if(as==0&&bs!=0) System.out.println(bs);
		else if(as!=0&&bs==0) System.out.println(as);
		else{
		long ans = Math.max(as,bs);
		boolean fin = false;
			for(int i = as-1; i >= 0; i--) {
				for(int j = bs-1; j >= 0; j--) {
					if(a[i]+b[j]<=k) {
						ans = i+j+2;
						fin = true;
						break;
					}
				}
				if(fin) break;
			}
			System.out.println(ans);
		}
	}
}