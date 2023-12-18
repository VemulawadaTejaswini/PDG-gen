import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 1000000000+7;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        main.solve();
//        out.flush();
        System.out.println(main.solve());
    }
    long solve() throws IOException{
        int n = sc.nextInt(), k = sc.nextInt();
        // instead of computing every time, we should conpute and record
        // therefore, starting from bigger values can help (recording)
        // exactly how many have the gcd as exactly i
        long[] arr_num = new long[k+1];
        long ans = 0;
        for(int i=k;i>0;i--){
            int bmax = k/i;
            long temp = power(bmax,n);
            for(int j=2*i;j<=k;j+=i){
                // subtract its multiples, which have already been computed and recorded
                temp = (temp+mod-arr_num[j])%mod;
            }
            arr_num[i] = temp;
            ans = (ans+temp*i)%mod;
        }
        return ans;
    }
    long power(long base, long q){
        long ans = 1;
        while(q>0){
            if(q%2==1) ans = ans*base%mod;
            base = base*base%mod;
            q /= 2;
        }
        return ans;
    }
}

