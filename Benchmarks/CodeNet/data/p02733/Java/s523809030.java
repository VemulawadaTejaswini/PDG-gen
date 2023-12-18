import java.io.*;
import java.util.*;
import java.lang.*;
 
 
public class Main implements Runnable
{
    @Override
    public void run() {
        InputReader in = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
        String[] strs = in.nextLine().split(" ");
        int H = Integer.parseInt(strs[0]), W = Integer.parseInt(strs[1]), K = Integer.parseInt(strs[2]);
        
        String[] arr = new String[H];
        for (int i = 0; i < H; i++) {
            arr[i] = in.nextLine();
        }
 
        w.println(getRes(arr, K));
 
        w.flush();
        w.close();
    }
 
    private static int getRes(String[] arr, int K) {
        int h = arr.length, w = arr[0].length();
        // System.out.println(h + " " + w + " " + K);
        int res = w;
        for (int i = 0; i < 1 << (h-1); i++) {
            res = Math.min(res, Integer.bitCount(i) + cal(arr, i, K));
        }
        return res;
    }
 
    private static int cal(String[] arr, int bit, int K) {
        int res = 0, h = arr.length, w = arr[0].length(), c = Integer.bitCount(bit) + 1;
        int[] count = new int[c];
        for (int j = 0; j < w;) {
            int part = 0;
            boolean valid = true;
            for (int i = 0; i < h; i++) {
                count[part] += arr[i].charAt(j) - '0';
                if (count[part] > K) {
                    count = new int[c];
                    valid = false;
                    res++;
                    break;
                }
                if ((bit >> i & 1) == 1) part++;
            }
            if (valid) j++;
            // System.out.println(j);
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