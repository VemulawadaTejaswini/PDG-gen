
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        System.out.println(solve(n));
    }

    private static int solve(long n){
        if(n==1)
            return 0;
        if(isPrime(n))
            return 1;
        long temp = n;
        int[] factors = new int[1000001];
        for(int prime=2;prime<=(int)Math.sqrt(n);prime++){
            while(temp%prime==0){
                factors[prime]++;
                temp/=prime;
            }
        }
        int count=0;
        for(int i=2;i<=1000000;i++){
            int fac = factors[i];
            for(int j=1;j<=fac;j++){
                fac-=j;
                count++;
            }
        }
        if(temp>1)
            count++;
        return count;
    }

    private static boolean isPrime(long n){
        for(int prime=2;prime*prime*1L<=n;prime++){
            if(n%prime==0)
                return false;
        }
        return true;
    }
}