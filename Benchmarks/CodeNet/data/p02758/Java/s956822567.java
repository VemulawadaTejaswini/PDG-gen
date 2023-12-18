import java.io.*;
import java.util.*;


public class Main implements Runnable
{
    @Override
    public void run() {
        InputReader in = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
        int n = in.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        //System.out.println(arr.length);
        long res = getRes(arr);
        w.println(res);

        w.flush();
        w.close();
    }

    private static long getRes(int[][] arr) {
        int mod = 998244353;
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a1, int[] a2) {
                return a1[0] - a2[0];
            }
        });
        // dp[i] is the number of ways for last i robot, when i is there or not there
        // dp[i][0] = dp[i + 1][0] + dp[i + i][1]
        // dp[i][1] = will activate i + 1 ? dp[i + 1][1] : dp[i][0];
        int l = arr.length;
        long[] dp = new long[l + 1];
        int[] far = new int[l + 1];
        
        // if you activate i, the nearest one that can not be activated
        far[l] = l;
        dp[l] = 1;

        for (int i = l - 1; i >= 0; i--) {            
            int k = i + 1;
            // System.out.println("check " + k + " " + l);
            while (k < l && arr[k][0] < arr[i][0] + arr[i][1]) {
                System.out.println("this is " + i + " : " + k);
                k = Math.max(far[k], k + 1);
            }

            far[i] = k;
            dp[i] = (dp[i + 1] + dp[k]) % mod;
        }

        // for (int i = 0; i < l; i++) {
        //     System.out.println(i + " " + dp[i]);
        // }
        return dp[0];
    }

    // we find the max index which value is less than this
    // private static int binary(int[][] arr, int target) {
    //     int left = 0;
    //     int right = arr.length - 1;
    //     while (left < right) {
    //         int mid = (left + right + 1) / 2;
    //         if (arr[mid][0] >= target) {
    //             mid = right--;
    //         }
    //         else {
    //             mid = left;
    //         }
    //     }
    //     return left;
    // }


    static class InputReader
    {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public InputReader(InputStream stream)
        {
            this.stream = stream;
        }

        public int read()
        {
            if (numChars==-1)
                throw new InputMismatchException();

            if (curChar >= numChars)
            {
                curChar = 0;
                try
                {
                    numChars = stream.read(buf);
                }
                catch (IOException e)
                {
                    throw new InputMismatchException();
                }

                if(numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine()
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
        public int nextInt()
        {
            int c = read();

            while(isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-')
            {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do
            {
                if(c<'0'||c>'9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public long nextLong()
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-')
            {
                sgn = -1;
                c = read();
            }
            long res = 0;

            do
            {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble()
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-')
            {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.')
            {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.')
            {
                c = read();
                double m = 1;
                while (!isSpaceChar(c))
                {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public String readString()
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do
            {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c)
        {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next()
        {
            return readString();
        }

        public interface SpaceCharFilter
        {
            public boolean isSpaceChar(int ch);
        }
    }

    public static void main(String args[]) throws Exception
    {
        new Thread(null, new Main(),"Main",1<<27).start();
    }

}
