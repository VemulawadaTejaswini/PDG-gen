import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastReader sc = new FastReader();
        String s=sc.next();
        int n=s.length();
        boolean l=isPal(s.substring(0,(n-1)/2));
        boolean r=isPal(s.substring(((n+3)/2)-1));
        if (l & r) System.out.println("Yes");
        else System.out.println("No");
    }
    static boolean isPal(String s){
        if (s.length()==1)return true;
        int l=0,r=s.length()-1;
        while (l<=r){
            if (s.charAt(l)!=s.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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