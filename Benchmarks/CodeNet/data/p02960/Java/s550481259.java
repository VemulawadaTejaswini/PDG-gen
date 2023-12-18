import java.util.*;
public class Main {
	public static long mod;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long mod = (long)Math.pow(10, 9)+7; 
		final int N = 13; 
		long r[] = new long[N];
		
		r[0]=1;//初期値で、0を13で割った余りは0
		int last = S.length()-1;
		long mul = 1;//見てる桁数
		for(int i=0;i<=last;i++) {
			long nextr[] = new long[N];
			if(S.charAt(last-i)=='?') {
				for(int j=0;j<=9;j++) {
					int tmp =(int)((j*mul)%13);
					for(int k=0;k<N;k++) {
						nextr[(k+tmp)%13]+=r[k]%mod;
						nextr[(k+tmp)%13] %= mod;
					}
				}
			}else {
				int tmp = (int)((S.charAt(last-i)*mul)%13);
				for(int k=0;k<N;k++) {
					nextr[(k+tmp)%13]+=r[k]%mod;
					nextr[(k+tmp)%13] %= mod;
				}
			}
			mul = (mul*10)%mod;
			r = nextr;		
		}
		long ans = r[5];
		System.out.println(ans);
	}
}