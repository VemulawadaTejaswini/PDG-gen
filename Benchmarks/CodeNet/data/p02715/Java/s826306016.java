import java.util.*;
public class Main {
	
    public static long gcd(long x,long y){
        if(x < y) return gcd(y, x);
        if(y == 0) return x;
        return gcd(y, x % y);
    }
  
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
        int n = sc.nextInt();
        long ans = 1;
        long mod = 1000000007;
        for(int i=0;i<n;i++){ans*=k;ans%=mod;      
                            }        
		System.out.println(ans);
	}
}
