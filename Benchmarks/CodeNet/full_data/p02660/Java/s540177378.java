//package code;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Milo
 */
public class Main {
    
    static FastReader in = new FastReader();
    public static void main(String[] args) {
        int t = 1; //in.nextInt();
        while (t-- > 0)
            solve();
    }
 
    public static void solve() {
        long n = in.nextLong();
        long t = n;
        int sq = (int)Math.sqrt(n);
        boolean p[] = new boolean[sq + 1];
        List<Integer> pr = new ArrayList();
        if(n < 2){
            System.out.println("0");
            return;
        }
        Arrays.fill(p, true);
        for(int i = 2; i * i <= sq; ++i){
            if(p[i]){
                pr.add(i);
                for(int j = i + i; j <= sq; j += i){
                    p[j] = false;
                }
            }
        }
        int w = 1;
        int ans = 0;
        //System.out.println(pr);
        while(n > 1L){
            boolean b_ = false;
            for(int a : pr){
                long pw = power(a, w);
                if(pw < 1){
                    continue;
                }
                if(pw > n){
                    b_ = true;
                    break;
                }
                if(n % pw == 0){
                    n /= pw;
                    ans++;
                }                
            }
            if(b_) break;
            w++;
            if(w > sq){
                break;
            }
        }
        if(n == t){
            System.out.println("1");
        }else{
            System.out.println(n == 1 ? ans : ans + 1);
        }
    }
    
    public static long power(long a, long b){
        long ans = 1;
        while(b > 0){
            if(b % 2 == 1) ans *= a;
            a *= a;
            b /= 2;
        }
        return ans;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
 
        double nextDouble() {
            return Double.parseDouble(next());
        }
 
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
 
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
 
    public static int min(int a, int b) {
        return a < b ? a : b;
    }
 
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, (a % b));
    }
}
