
import java.util.*;
import java.io.PrintWriter;

public class Main{
	static long[] hash1,hash2,power1,power2;
	static long base1 = 1007, base2 = 2009,mod1 = 1000000007, mod2 = 1000000009;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		rollingHash(s);
		int res = 0;
		for (int i = 1; i <= n; ++i) {
			for (int j = i+1; j <= n; ++j) {
				int lcp = getLCP(i, j);
				lcp = Math.min(lcp, j-i);
				res = Math.max(res, lcp);
			}
		}   
		System.out.println(res);
	}
	static void rollingHash(String s){
		int n=s.length();
		hash1=new long[n+1];
		hash2=new long[n+1];
		power1=new long[n+1];
		power2=new long[n+1];
		power1[0]=power2[0]=1;
		for(int i=0; i<n; i++){
			hash1[i+1]=(hash1[i]*base1+s.charAt(i))%mod1;
			hash2[i+1]=(hash2[i]*base2+s.charAt(i))%mod2;
			power1[i+1]=(power1[i]*base1)%mod1;
			power2[i+1]=(power2[i]*base2)%mod2;
		}
	}
	static int getLCP(int a,int b){
		int len=Math.min(hash1.length-a,hash1.length-b);
		int low=0,high=len;
		while(high-low>1){
			int mid=(high+low)/2;
			if ((getHash1(a, a+mid) == getHash1(b, b+mid)) && (getHash2(a, a+mid) == getHash2(b, b+mid) )) low = mid;
            else high = mid;
		}
		return low;
	}
	static long getHash1(int l,int r){
		long res1 = hash1[r] - hash1[l] * power1[r-l] % mod1;
		if (res1 < 0) res1 += mod1;
		return res1;
	}
	static long getHash2(int l,int r){
		long res2 = hash2[r] - hash2[l] * power2[r-l] % mod2;
		if (res2 < 0) res2 += mod2;
		return res2;
	}
}

