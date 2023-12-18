import java.util.*;
public class Main {
		
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
	
		int prime[] = new int[N+1];
		Arrays.fill(prime, 1);
		for(int k=2;k<=N;k++) {
			int tmp = k;
			for(int i=2;i*i<=k;i++) {
				while(tmp%i==0) {
					tmp /= i;
					prime[i]++;
				}
			}
			if(tmp!=1)prime[tmp]++;
			
		}
		
		int _3up = 0;
		int _5up = 0;
		int _15up = 0;
		int _25up = 0;
		int _75up = 0;
		
		for(int i=0;i<N+1;i++) {
			
			if(prime[i]>=75) _75up ++;
			else if(prime[i]>=25) _25up ++;
			else if(prime[i]>=15) _15up ++;
			else if(prime[i]>=5)  _5up ++;
			else if(prime[i]>=3)  _3up ++;
		}
		
		int sum = _75up + _25up + _15up + _5up + _3up;
		
		int ans = _75up + (_75up + _25up) * (sum - 1) + (_75up + _25up + _15up) * (sum - _3up - 1)
					+ (_75up + _25up + _15up + _5up) * (_75up + _25up + _15up + _5up - 1)/2 * (sum - 2);
				
		
		System.out.println(ans);
	}
	
	
}