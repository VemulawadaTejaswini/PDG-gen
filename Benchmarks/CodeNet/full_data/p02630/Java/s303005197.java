import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int[] ar = fs.readArray(n);
        int q = fs.nextInt();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();
        for (int i = 0; i<q; i++) {
            B.add(fs.nextInt());
            C.add(fs.nextInt());
        }
        int sum = 0;
        for (int x = 0; x<q; x++) {
            sum = 0;
            for (int i = 0; i<n; i++) {
                if (B.get(x) == ar[i]) {
                    ar[i] = C.get(x);
                }
            }
            for (int i = 0; i<n;i++) {
                sum+=ar[i];
            }
            System.out.println(sum);

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

