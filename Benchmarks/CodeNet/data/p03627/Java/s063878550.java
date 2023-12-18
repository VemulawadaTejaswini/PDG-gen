import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        TreeMap<Long, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            long x = in.nextLong();
            if (map.get(x) == null) {
                map.put(x, 1);
            }
            else {
                map.put(x, map.get(x) + 1);
            }
        }

        long a = -1, b = -1;
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            long key = entry.getKey();
            long value = entry.getValue();
            if (value >= 2) {
                if (a == -1 || b == -1) {
                    if (a == -1) a = key;
                    else b = key;
                }
                else {
                    if (a < key) a = key;
                    else if (b < key) b = key;
                }
            }
        }
        if (a == -1 || b == -1) {
            out.println(0);
        }
        else {
            out.println(a * b);
        }
        out.close();
    }

    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader()
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
                catch (IOException e)
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

