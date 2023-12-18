import java.util.*;
public class  Main {
    private static long gcd(long a, long b){
            if(b==0)
                return a;
            else
                return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final long mod = 1000000000+7;
        int n = sc.nextInt();
        Long[] arr = new Long[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLong();
        }
        Long[] lcm = new Long[n+1];
        lcm[0] = 1L;
        for(int i=0,j=0; i<n; i++){
          long ans = findLCM(lcm[j],arr[i]);
          j++;
          lcm[j] = ans;
        }
        long finlcm = lcm[n];
        long ans = 0;
        for(int i=0; i<n;i++){
             ans += (finlcm/arr[i])%mod;
        }
        System.out.println(ans%mod);
    }
    private static long findLCM(long a, long b){
        return (a*b)/gcd(a,b);
    }
}
