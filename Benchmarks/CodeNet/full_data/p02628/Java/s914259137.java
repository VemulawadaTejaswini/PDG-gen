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

        int N = fs.nextInt(); int K = fs.nextInt();

        int[] ar = fs.readArray(N);
        Arrays.sort(ar);

        int sum = 0;
        for (int i = 0; i<K; i++) {
            sum +=ar[i];
        }
        System.out.println(sum);







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

