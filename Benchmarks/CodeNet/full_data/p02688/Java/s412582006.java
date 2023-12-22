import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int k = fs.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int TT = 0; TT < k; TT++) {
            int d = fs.nextInt();
            int[] ar = fs.readArray(d);
            boolean t = false;
            for (int i = 0; i < d; i++) {
                t = false;
                for (int q = 0; q < ans.size(); q++) {
                    if (ar[i] == ans.get(q)) {
                        t = true;
                        break;
                    }
                }
                if (t == false) {
                    ans.add(ar[i]);
                }

            }
        }
        System.out.println(n-ans.size());
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
