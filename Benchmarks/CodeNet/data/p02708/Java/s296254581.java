import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int k = sc.nextInt();
		long mod = 1000000007;
        long ans = 0;
        for(int i=k;i<=n+1;i++){ans+=(i*(2*n-i+1)/2-i*(i-1)/2)+1;
                                ans%=mod;}       
		System.out.println(ans);
	}
}
