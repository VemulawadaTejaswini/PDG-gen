import java.util.*;
import java.io.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        long mod=1000000007;
        int n=sc.nextInt();
        int m=sc.nextInt();
        long[] x=new long[n];
        long[] y=new long[m];
        for (int i = 0; i < n; i++) {
            x[i]=sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            y[i]=sc.nextInt();
        }
        long row=0,column=0;
        for (int i = 0; i < n; i++) {
            column=(column+i*x[i]-(n-i-1)*x[i]+mod)%mod;
        }
        for (int i = 0; i < m; i++) {
            row=(row+i*y[i]-(m-i-1)*y[i]+mod)%mod;
        }
        out.println((row*column)%mod);
        out.close();
    }

    static PrintWriter out = new PrintWriter(System.out);

    static class sc {
        static Scanner s = new Scanner(System.in);

        static String next() {
            return s.next();
        }

        static int nextInt() {
            return Integer.parseInt(s.next());
        }

        static long nextLong() {
            return Long.parseLong(s.next());
        }

        static double nextDouble() {
            return Double.parseDouble(s.next());
        }
    }

}