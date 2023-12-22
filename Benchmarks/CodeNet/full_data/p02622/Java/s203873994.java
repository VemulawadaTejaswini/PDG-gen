import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    private static FastScanner sc;

    private static class FastScanner {
        private Scanner sc;

        FastScanner() {
            sc = new Scanner(System.in);
        }

        public int ni() {
            return sc.nextInt();
        }

        public String ns() {
            return sc.nextLine();
        }

        public long nl() {
            return sc.nextLong();
        }

        public double nd() {
            return sc.nextDouble();
        }
    }

    private static void print(Object o) {
        System.out.print(o);
    }

    private static void println(Object o) {
        System.out.println(o);
    }
    
    private static void printf(String s, Object... data) {
    	System.out.printf(s, data);	
    }

    public static void main(String[] args) {
        sc = new FastScanner();

        solve();
    }

    private static void solve() {
        String first = sc.ns();
        String second = sc.ns();
        int res = 0;

        char[] f = first.toCharArray();
        char[] s = second.toCharArray();

        for(int i = 0; i < f.length; i++) {
            if(f[i] != s[i]) {
                res++;
            }
        }

        println(res);
    }
}