import java.io.*;
import java.util.*;
/**
 * Main
 */
public class Main {
       static int mod  = 1000000007;
        static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) {
       MyScanner ms  = new MyScanner();
       long A = ms.nextInt();
       long B = ms.nextInt();
       long C = ms.nextInt();
       long K =ms.nextInt();
       long sum=0;
       if(K>0){
        if(A>K)
        sum+=K;
        else
        sum+=A;
        K-=A;
       }
       if(K>0){
           K-=B;
       }
       if(K>0){
        if(B>K)
        sum-=K;
        else
        sum-=B;
           K-=B;
       }
       pw.println(sum);
    pw.flush();

    }public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
   
        public MyScanner() {
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
   
        String nextLine(){
            String str = "";
        try {
           str = br.readLine();
        } catch (IOException e) {
           e.printStackTrace();
        }
        return str;
        }
  
     }
}