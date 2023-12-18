import java.util.*;
public class Main {
	
	static int mod = (int)1e9+7;
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		for(int i=0;i<N;i++)A[i]=sc.nextLong();
		sc.close();

		long ans = 0;
		for(int i=0;i<60;i++) {
			int cnt = 0;
			for(int j=0;j<N;j++) {
				if(((A[j]>>i)&1)==1) cnt++;
			}
			long tmp = (long)cnt*(N-cnt) %mod;
			long mul = ((long)1<<i)%mod;
			//long mul = (long)Math.pow(2, i) % mod;
			ans += (tmp * mul % mod);
			ans %= mod;	
		}
		System.out.println(ans);
	}
	
}