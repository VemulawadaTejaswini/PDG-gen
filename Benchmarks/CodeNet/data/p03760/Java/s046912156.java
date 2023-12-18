import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        StringBuilder sb = new StringBuilder();
        String odd = sc.next();
        String even = sc.next();
        String ans = "";
        int total = odd.length() + even.length();
        int oc = 0, ec = 0;
        int i = 0;
        while (i < total) {
            if (i%2 == 0) {
                ans += odd.charAt(oc++);
            }
            else {
                ans += even.charAt(ec++);
            }
            i++;
        }
        System.out.println(ans);
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}