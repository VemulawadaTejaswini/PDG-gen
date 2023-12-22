import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Math;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int x = fs.nextInt();
        int y = fs.nextInt();
        int lim = x+1;
        String ans = "No";
        for (int i = 0; i<lim;i++) {
            for (int q = 0; q<(lim-i);q++) {
                if (2*i+4*q == y) {
                    if (i+q == x) {
                        ans = "Yes";
                    }
                    break;
                }
            }
        }
        System.out.println(ans);






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

