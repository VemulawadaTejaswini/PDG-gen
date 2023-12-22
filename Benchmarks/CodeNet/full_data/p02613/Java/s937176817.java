import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Math;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        String[] ar = new String[t];
        for (int TT=0;TT<t;TT++) {
            ar[TT] = fs.next();
        }
        HashMap<String,Integer> x = new HashMap<>();
        x.put("AC", 0);
        x.put("WA",0);
        x.put("TLE",0);
        x.put("RE",0);

        for (int i = 0; i<t; i++) {
            x.put(ar[i],x.get(ar[i])+1);
        }

        System.out.println("AC x " + x.get("AC"));
        System.out.println("WA x " + x.get("WA"));
        System.out.println("TLE x " + x.get("TLE"));
        System.out.println("RE x " + x.get("RE"));




    }





    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
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
        long nextLong() {
            return Long.parseLong(next());
        }
    }

}
