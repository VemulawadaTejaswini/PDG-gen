import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Math;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int[] ar = fs.readArray(n);


        int count = 0;
        ArrayList<Integer> forbidden = new ArrayList<>();
        Arrays.sort(ar);
        boolean[] xr = f(ar,ar[n-1]+1);
        for (int i = 0; i<n-1; i++) {
            if (ar[i] == ar[i+1]) {
                forbidden.add(ar[i]);
            }
        }
        int av = 0;
        for (int i : ar) {
            if (xr[i] == true) {
                for (int q = 0; q<forbidden.size(); q++) {
                    if (i == forbidden.get(q)) {
                        av =1;
                        break;
                    }
                }
                if (av == 0) {
                    count++;
                } else {
                    av=0;
                }
            }
        }
        System.out.println(count);

    }
    public static boolean[] f(int[] ar, int n) {

        boolean[] x = new boolean[n];
        for (int i = 0; i < n; i++) {
            x[i] = true;
        }
        for (int a : ar) {
            for (int i = 2*a; i < n; i += a) {
                x[i] = false;
            }
        }
        return x;


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
 