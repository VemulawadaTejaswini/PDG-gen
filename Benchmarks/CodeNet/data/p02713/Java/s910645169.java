import java.util.*;
import java.io.*;
public class Main {
    
    public static void main(String[] args) {
        MyScanner ms = new MyScanner();
        int K = ms.nextInt();
        long sum=0;
        for(int i=1;i<=K;i++)
        for(int j=1;j<=K;j++)
        for(int c=1;c<=K;c++){
            sum+=(gcd(gcd(i,j),c));
        }
       System.out.println(sum);
    }
   static  int gcd (int a, int b) {
        return b != 0 ? gcd (b, a % b) : a;
    }
    public static class MyScanner {
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