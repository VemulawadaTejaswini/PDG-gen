import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int N = fs.nextInt(); int X = fs.nextInt(); int T = fs.nextInt();

        int times = 0;
        if (N%X != 0) {
            times+= N/X;
            times+= 1;
        } else {
            times+=N/X;
        }
        System.out.println(times*T);

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

