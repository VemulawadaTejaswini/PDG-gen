import java.util.*;
import java.io.*;
public class Main{
    static PrintWriter out;
    static InputReader in;
    public static void main(String args[]){
        out = new PrintWriter(System.out);
        in = new InputReader();
        new Main();
        out.flush(); out.close();
    }   
    Main(){
        solve();
    }
    void solve(){
        long n = in.nextLong(), x = in.nextLong();
        long ans = n;
        while(x != 0){
            long a = (n - x) / x, b = (n - x) % x;
            ans += 2 * a * x;
            if(b == 0){
                ans -= x;
                break;
            }
            ans += 2 * (x / b) * b;
            x = x % b; n = b + x; 
            if(x == 0){
                ans -= b;
            }
        }
        out.print(ans);
    }
    public static class InputReader{
        BufferedReader br;
        StringTokenizer st;
        InputReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        public int nextInt(){
            return Integer.parseInt(next());
        }
        public long nextLong(){
            return Long.parseLong(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
        public String next(){
            while(st == null || !st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch(IOException e){}
            }
            return st.nextToken();
        }
    }
}
        