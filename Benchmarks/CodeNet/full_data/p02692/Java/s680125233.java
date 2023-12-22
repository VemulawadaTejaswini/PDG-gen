//package code;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        char ans[] = new char[n];
         
        for(int i = 0; i < n; ++i){
            String s = in.next();
            if(s.equals("AB")){
                if(a > b){
                    a -= 1;
                    b += 1;
                    ans[i] = 'B';
                }else{
                    a += 1;
                    b -= 1;
                    ans[i] = 'A';
                }
            }else if(s.equals("AC")){
                if(a > c){
                    a -= 1;
                    c += 1;
                    ans[i] = 'C';
                }else{
                    a += 1;
                    c -= 1;
                    ans[i] = 'A';
                }
            }else if(s.equals("BC")){
                if(b > c){
                    b -= 1;
                    c += 1;
                    ans[i] = 'C';
                }else{
                    b += 1;
                    c -= 1;
                    ans[i] = 'B';
                }
            }
            if(a < 0 || b < 0 || c < 0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        for(char cc : ans){
            System.out.println(cc);
        }
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
