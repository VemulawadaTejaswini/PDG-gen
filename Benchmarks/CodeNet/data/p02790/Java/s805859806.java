import java.util.*;
import java.io.*;
 
public class Main {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
 
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
 
        double nextDouble() {
            return Double.parseDouble(next());
        }
 
        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
 
        public long[] readLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
    }
 
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
      PrintWriter out = new PrintWriter(System.out);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
//        String sc1 = "";
//        String sc2 = "";
        for (int i = 0; i < b - 1; ++i) {
            s1 += s1.charAt(i);
        }
        for (int i = 0; i < a - 1; ++i) {
            s2 += s2.charAt(i);
        }
//        boolean ok = false;
//        for (int i = 0; i < a ; ++i) {
//            for(int j = 0; j <)
//            if (s1.charAt(i) >= s2.charAt(i)) {
//                ok = true;
//            }
//
//
//        }
//        if (ok == true) {
//            System.out.println(s2);
//        } else {
//            System.out.println(s1);
//        }
         if(a >= b){
             out.println(s2);
         }
         else{
             out.println(s1);
         }
      out.close();
    }
}