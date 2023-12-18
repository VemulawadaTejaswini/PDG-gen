import java.util.*;
public class Main {
    
    private static long fact[] = new long[123456];
    private static long rfact[] = new long[123456];
    
    private static void pre(){
        fact[0] = 1;
        rfact[0] = 1;
        for(int i=1;i<=123455;i++){
            fact[i] = (fact[i-1]*i)%998244353;
            rfact[i] = rev(fact[i]);
        }
    }
    
    
   private static long binaryPower(long a,int n){
    long res = 1;
    while(n>=0){
        if(n%2!=0){
            res = (res * a)%998244353;
        }
        a = (a*a)%998244353;
        n>>=1;
    }
    return res;
}
private static long rev(long x){
    return binaryPower(x,998244351);
}
    private static long c(long g1, long g1g){
        int g =(int)g1;
        int gg  = (int)g1g;
       return ((fact[g]*rfact[gg])%998244353*rfact[g-gg])%998244353;
    }
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n= sc.nextInt();
	    int a=sc.nextInt(), b= sc.nextInt();
	    pre();
	    long k = sc.nextLong();
	    long ans = 0l;
	     int mod = 998244353;
	     if(k==0){
	         System.out.println(1); return;
	     }
	    for(int i=1;i<=n;i++){
	        long aa = k-a*i;
	        if(aa<b){
	            continue;
	        }
	        if(aa%b==0 && aa/b<=n){
	            long p = aa/b;
	            long cu= (c(n,i) * c(n, p))%mod;
	            ans+=cu;
	            if(ans>998244353){
	                ans-=998244353;
	            }
	        }
	    }
	    System.out.println(ans);
	}
}