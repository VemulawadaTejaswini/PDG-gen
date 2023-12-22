import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        String S = fs.next();
        String T = fs.next();
        char[] Tt = T.toCharArray();

        int c = 0;
        int recC = 0;
        for (int i = 0; i<S.length()-Tt.length;i++) {
            if (c>recC) {
                recC=c;
                c=0;
            }
            for (int q = 0; q<Tt.length; q++) {


                if (S.charAt(i+q) == Tt[q]) {
                    c++;
                }
            }
        }
        System.out.println(Tt.length-recC);

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

