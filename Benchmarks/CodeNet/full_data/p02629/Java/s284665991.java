import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        String n = fs.next();

        String t = convertFromBaseToBase(n,10,26);
        char[] tt = t.toCharArray();
        char[] alphabet = "xabcdefghijklmnopqrstuvwxyz".toCharArray();
        String alphabet2 = "0123456789abcdefghijklmnop";
        /*
        a=10
        b=11
        c=12
        d=13
        e=1
         */
        for (int i = 0; i<t.length(); i++) {
            if (tt[i] == '0') {
                continue;
            } else {
                System.out.print(alphabet[alphabet2.indexOf(tt[i])]);
            }
        }
        





    }
    public static String convertFromBaseToBase(String str, int fromBase, int toBase) {
        return Integer.toString(Integer.parseInt(str, fromBase), toBase);
    }


    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");

        public String next() {
            while (!st.hasMoreElements())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
    }

}

