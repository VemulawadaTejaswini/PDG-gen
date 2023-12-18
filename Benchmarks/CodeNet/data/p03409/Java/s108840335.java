import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        Pair[] reds = new Pair[n];
        Pair[] blues = new Pair[n];
        for(int i = 0; i < n; i++) {
            reds[i] = new Pair(sc.nextInt(), sc.nextInt());
        }
        for(int i = 0; i < n; i++) {
            blues[i] = new Pair(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(reds, Collections.reverseOrder());
        Arrays.sort(blues);

        int ans = 0;
        int offset = 0;
        for (int i = 0; i < n; i++) {
            Pair red = reds[i];
            for (int j = 0; j + offset < n; j++) {
                Pair blue = blues[j + offset];
                if (goodPair(red, blue)) {
                    ans++;
                    Pair temp = blue;
                    blues[j + offset] = blues[offset];
                    blues[offset] = temp;
                    offset++;
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    static boolean goodPair(Pair red, Pair blue) {
        if (red.x < blue.x && red.y < blue.y) return true;
        else return false;
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

    static class Pair implements Comparable<Pair> {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(Pair p) {
            return this.x - p.x;
        }
    }
}
