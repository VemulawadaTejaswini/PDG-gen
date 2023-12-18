import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
        long k = sc.nextLong();
		long mod = 1000000007;
        long ans = 0;
        for(long i=k;i<=n+1;i++){ans+=((i*(2*n-i+1))/2-(i*(i-1))/2)+1;
                               ans%=mod;}       
		System.out.println(ans);
	}
}