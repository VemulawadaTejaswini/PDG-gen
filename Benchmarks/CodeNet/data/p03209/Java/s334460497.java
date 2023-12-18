import java.util.*;
public class Main{
	public static void main(String[] args){
		long ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextLong();
		
		long[] all = new long[n+1];
		long n2 = 2;
		for(int i=0; i<=n; i++){
			n2 *= 2;
			all[i] = n2 - 3;
		}
		
		long[] patty = new long[n+1];
		long start = 0;
		for(int i=0; i<=n; i++){
			start = start*2+1;
			patty[i] = start;
		}
		
		long middle = 2;
		for(int i=0; i<n; i++){
			middle *= 2;
		}
		if(x >= middle-1){
			ans = patty[n] - getpnum(n, all[n] - x, all, patty);
		}
		else{
			ans = getpnum(n, x, all, patty);
		}
		
		System.out.println(ans);
	}
	
	static long getpnum(int n, long x, long[] all, long[] patty){
		int med = n;
		int m = 0;
		long ans = 0;
		while(med+all[m] <= x){
			ans = patty[m];
			med--;
			m++;
		}
		if(ans == 0){
			return 0;
		}
		long q = x - (med+1) - all[m-1];
		if(q > 0){
			ans++;
			ans += getpnum(m, q, all, patty);
		}
		
		return ans;
	}
}