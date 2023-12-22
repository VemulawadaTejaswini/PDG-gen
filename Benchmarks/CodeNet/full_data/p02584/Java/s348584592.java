import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
 
/*
    Author: Koushik Sahu
    Created: 02 September 2020 Wed 21:14:21
*/

public class Main {

    static FastScanner fs=new FastScanner();
        
    static long x, k, d;

    public static void main(String[] args){
        x = fs.nextLong();
        k = fs.nextLong();
        d = fs.nextLong();
        x = Math.abs(x);
        long r = x%d;
        long l = r-d;
        if((x-r)/d <= k){
            if((((x-l)%2)^(k%2))==0){
                System.out.println(Math.abs(l));
            }else{
                System.out.println(r);
            }
        }else{
            System.out.println(x-k*d);
        }
    }
        
    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
                            
        public String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        public String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
                                        
        public int nextInt() {
            return Integer.parseInt(next());
        }
                                                
        public int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
                                                        
        public long nextLong() {
            return Long.parseLong(next());
        }
                                                                
        public long[] readLongArray(int n) {
            long[] a=new long[n];
            for (int i=0; i<n; i++) a[i]=nextLong();
            return a;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
     
}