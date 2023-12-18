import java.io.*;
import java.math.*;
import java.util.*;


public class Main{
    static long MOD = 998244353l;
    static long [] fac;

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        // Start writing your solution here. -------------------------------------
        //int t = sc.nextInt();
        int t = 1;
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int cur = 0;
            boolean valid = true;
            int [][] a = new int[n][3];
            for(int i = 0; i < n; i++)
            {
                String s = sc.nextLine();
                int res = 0, min = 0;
                for(char c : s.toCharArray())
                {
                    if(c == '(') res++;
                    else res--;
                    min = Math.min(min, res);

                }
                a[i][0] = min;
                a[i][1] = res;
                a[2][2] = min - res;
            }
            Arrays.sort(a, (m1, m2) -> m1[1] * m2[1] < 0 ? m2[1] - m1[1] : m1[1] + m2[1] > 0 ? m2[0] - m1[0] : m1[2] - m2[2]);
            for(int [] m : a)
            {
                if(cur + m[0] < 0) valid = false;
                else cur += m[1];
            }
            if(cur != 0) valid = false;
            out.println(valid ? "Yes" : "No");
        }

        out.close();
    }
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
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
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    //--------------------------------------------------------
}