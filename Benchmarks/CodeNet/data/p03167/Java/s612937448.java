

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) {
        FastReader reader = new FastReader();
        int h = reader.nextInt(), w = reader.nextInt();
        int mod = 1_000_000_007;

        int [][] grid = new int [h][w];
        for (int i = 0; i < h; i++) {
            String row = reader.nextLine();
            for (int j = 0; j < w; j++) {
                char c = row.charAt(j);
                if (c == '.') {
                    grid[i][j] = 0;
                } else {
                    grid[i][j] = -1;
                }
            }
        }

        grid[0][0] = 1;
        int j = 1;
        for (int i = 0; i < h; i++) {
            for (; j < w; j++) {
                if (grid[i][j] == -1) {
                    grid[i][j] = 0;
                    continue;
                }
                if (i > 0) {
                    grid[i][j] = (grid[i][j] + grid[i - 1][j]) % mod;
                }
                if (j > 0) {
                    grid[i][j] = (grid[i][j] + grid[i][j - 1]) % mod;
                }
            }
            j = 0;
        }

        System.out.println(grid[h - 1][w - 1]);

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
