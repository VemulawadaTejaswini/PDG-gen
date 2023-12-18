import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static int mod = 1000000007;

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long ans = 0;
        long[] sunNum= new long[N+1];
        for(int i=1;i<N+1;i++){
            sunNum[i] = sunNum[i-1] +i;
        }

        for(int i= K;i <=N;i++){
            //System.out.println((sunNum[N] - sunNum[N-i]) - sunNum[i-1]+ 1);
            ans += (sunNum[N] - sunNum[N-i]) - sunNum[i-1]+ 1;
            ans %= mod;
        }
        ans++;
        ans %= mod;

        System.out.println(ans);


    }

}







