import java.util.*;
import java.io.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        int n=sc.nextInt();
        int m=sc.nextInt();
        HashSet<Integer> factor=new HashSet<>();
        for (int i = 1; i * i <= m; i++) {
            if(m%i==0)factor.add(i);
        }
        int max=0;
        for (Integer k:factor){
            if((double)m/n>=k)max=max(max,k);
        }
        out.println(n==1?m:max);
        out.close();
    }
    static PrintWriter out = new PrintWriter(System.out);

    static class sc {
        static Scanner s = new Scanner(System.in);

        static String next() {
            return s.next();
        }

        static String nextLine() {
            return s.nextLine();
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

        static boolean hasNext() {
            return s.hasNext();
        }

        static boolean hasNextInt() {
            return s.hasNextInt();
        }

    }

}