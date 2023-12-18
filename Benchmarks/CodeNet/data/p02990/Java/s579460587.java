import java.util.*;

public class Main {

    static int mod = (int)Math.pow(10, 9)+ 7;

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int n = N-K+1;

        for (int i = 1; i <= K; i++) {

            if((n>0)&(N-K+1>=i)&(K>=i)) {
                long blue = nCr(N-K+1,i);
                long red = nCr(K-1,i-1);
                System.out.println(blue*red%mod);
            }else{
                System.out.println(0);
            }
            n--;
        }
        sc.close();
    }

    public static long factorical(int n){
        long tmp = 1;
        for (int i=n; i>0; i--){
            tmp = (tmp*i)%mod;
        }
        return tmp;
    }

    public static long power(long a, int n){
        long res=1;
        while(n>0){
            if ((n-n/2*2)==1){
                res = (res*a)%mod;
            }
            a = (a*a)%mod;
            n >>= 1;
        }
        return res;
    }

    public static long inv(long n){
        return power(n, mod-2);
    }

    public static long nCr(int n, int r){
        return factorical(n) * inv(factorical(n-r))%mod * inv(factorical(r))%mod;
    }
}


