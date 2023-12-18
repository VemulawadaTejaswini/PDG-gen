
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        int l = sc.nextInt();

        int[] apple = new int[n];

        int sum1 = 0;
        for (int i =1;i<=n;i++){
            apple[i-1] = l+i-1;
            sum1 += apple[i-1];
        }

        int res = 0;
        int abs = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            int tmpSum = 0;
            for (int k=0;k<n;k++){
                if (i != k) {
                    tmpSum += apple[k];
                }
            }
            int abtmp = Math.abs(sum1 - tmpSum);
            if (abtmp < abs) {
                abs = abtmp;
                res = tmpSum;
            }
        }

        out.println(res);
        out.flush();
    }

    //    public static void calcD(Map<Integer, Integer> dic, int index, )

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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