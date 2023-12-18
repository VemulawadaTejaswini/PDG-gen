import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int mod = 1000000007;
        long ans =0;
        long lastLcm = 1;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            arr[i] = n;
            lastLcm = lcm(lastLcm,n);
        }

        for (int i = 0; i < N; i++) {
            ans += lastLcm/arr[i];
        }
        System.out.println(ans%mod);
    }

static
    private long lcm(long a, long b ){
        return a*b/gcd(a,b);
    }
static
    private long gcd(long a, long b ){
        if(a%b==0){
            return b;
        }
        return gcd(b, a%b);
    }
}
