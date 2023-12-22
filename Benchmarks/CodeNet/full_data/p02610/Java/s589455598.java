import java.io.*;
import java.util.*;


public class Main implements Runnable
{

    @Override
    public void run() {
        InputReader in = new InputReader(System.in);
        w = new PrintWriter(System.out);
        t = in.nextInt();
        for (int i = 0; i < t; i++) {
            n = in.nextInt();
            camel = new int[n][4];
            for (int k = 0; k < n; k++) {
                camel[k][0] = in.nextInt();
                camel[k][1] = in.nextInt();
                camel[k][2] = in.nextInt();
                camel[k][3] = camel[k][1] - camel[k][2];
            }
            getRes();
        }

        w.flush();
        w.close();
    }

    static PrintWriter w;
    static int t, n;
    static int[][] camel;
    // static String s;
    // final static int mod = (int) (1e9 + 7);

    private static void getRes() {
        Arrays.sort(camel, (a, b) -> a[0] - b[0]);
//        // for each one, we want it on among the range first.
//        for (Integer[] c : camel) {
//             System.out.println(Arrays.toString(c));
//        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[3] == b[3]) {
                return b[0] - a[0];
            }
            return a[3] < b[3] ? - 1 : 1;
        });

        long res = 0;
        for (int i = 1; i <= n; i++) {
            int[] c = camel[i - 1];
            res += c[1];
            pq.offer(c);
            if (pq.size() > c[0]) {
                res -= pq.poll()[3];
            }
        }

        int size = n;
        while (!pq.isEmpty()) {
            int[] c = pq.poll();
            if (c[0] < size && c[3] < 0) {
                res -= c[3];
                size--;
            }
        }

        w.println(res);
    }


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
