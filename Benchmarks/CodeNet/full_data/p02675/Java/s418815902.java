
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;


class Main {
    
         
    static FastReader in;
    static StringBuilder out;
    
    public  static void main(String[] args) {
        out = new StringBuilder();
        in = new FastReader();
        String n=in.nextLine();
        char ch=n.charAt(n.length()-1);
        if(ch=='3'){
            System.out.println("bon");
        }else if(ch=='0' || ch=='1' || ch=='6' || ch=='8'){
            System.out.println("pon");
        }else{
            System.out.println("hon");
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
 
     
    
}