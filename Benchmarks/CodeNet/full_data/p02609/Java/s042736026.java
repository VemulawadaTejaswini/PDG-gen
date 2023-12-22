import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;


public class Main implements Runnable
{

    @Override
    public void run() {
        InputReader in = new InputReader(System.in);
        w = new PrintWriter(System.out);
        n = Integer.parseInt(in.nextLine());
        s = in.nextLine();
        getRes();

        w.flush();
        w.close();
    }

    static PrintWriter w;
    static int n;
    static String s;
    // final static int mod = (int) (1e9 + 7);

    private static void getRes() {
        int count = 0;
        for (char c : s.toCharArray()) {
            count += c - '0';
        }
        // System.out.println(count);

        int[] remainderPlus = new int[n + 1];
        int[] remainderMinus = new int[n + 1];
        int valPlus = 1, valMinus = 1;
        int rePlus = 0, reMinus = 0;
        for (int i = 1; i <= n; i++){
            remainderPlus[i] = valPlus;
            remainderMinus[i] = valMinus;
            valPlus = valPlus * 2 % (count + 1);
            valMinus = count == 1 ? 0 : valMinus * 2 % (count - 1);
            rePlus = (rePlus * 2 + s.charAt(i - 1) - '0') % (count + 1);
            reMinus = count == 1 ? 0 : (reMinus * 2 + s.charAt(i - 1) - '0') % (count - 1);
        }

        for (int i = 1; i <= n; i++) {
            if (s.charAt(i - 1) == '0') {
                int mod = (rePlus + remainderPlus[n - i + 1] + count + 1) % (count + 1);
                // System.out.println(i + " " + mod);
                w.println(cal(mod) + 1);
            }
            else {
                if (count == 1) {
                    w.println(0);
                    continue;
                }
                int mod = (reMinus - remainderMinus[n - i + 1] + count - 1) % (count - 1);
                w.println(cal(mod) + 1);
            }
        }

    }

    private static int cal(int num) {
        int res = 0;
        while (num != 0) {
            num = num % Integer.bitCount(num);
            res++;
        }
        return res;
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
