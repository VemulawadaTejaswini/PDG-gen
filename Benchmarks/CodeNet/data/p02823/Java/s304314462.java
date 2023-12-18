import java.io.*;
import java.util.*;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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

    static FastReader s = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    private static int[] rai(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    private static int[][] rai(int n, int m) {
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }

    private static long[] ral(int n) {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextLong();
        }
        return arr;
    }

    private static long[][] ral(int n, int m) {
        long[][] arr = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextLong();
            }
        }
        return arr;
    }

    private static int ri() {
        return s.nextInt();
    }

    private static long rl() {
        return s.nextLong();
    }

    private static String rs() {
        return s.next();
    }

    public static void main(String[] args) {
        StringBuilder ans = new StringBuilder();
//        int t = ri();
        int t=1;
        while (t-- > 0)
        {
            long n=rl();
            long v1=rl();
            long v2=rl();

            long a=Math.min(v1,v2);
            long b=Math.max(v1,v2);
            if(((b-a-1)&1)==1)
            {
                ans.append((b-a)/2);
            }
            else
            {
                long val=0;
                long val2=0;
                long a1=a,a2=a,b1=b,b2=b;
//                if(n-b<a-1)
//                {

                val+=n-b1+1;
                    a1+=n-b1+1;
                    b1=n;

//                }
//                else
//                {
                val2+=a2;
                    b2-=a2;
                    a2=1;

//                }

//                System.out.println(val+" "+val2);

                val+=(b1-a1)/2;
                val2+=(b2-a2)/2;

//                System.out.println(val+" "+val2);
                ans.append(Math.min(val,val2));
            }
            ans.append("\n");
        }
        out.print(ans.toString());
        out.flush();

    }
}
