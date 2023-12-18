import java.util.*;
import static java.lang.Math.*;

public class Main{

    static long gcd(long m, long n){
        if(m < n) return gcd(n,m);
        if(n == 0) return m;
        return gcd(n,m % n); 
    }
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        boolean flag = true;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
        }

        long ans = a[0];
        for(int i=1; i<n; i++){
            ans = gcd(ans,a[i]);
        }
        System.out.println(ans);
    }
}