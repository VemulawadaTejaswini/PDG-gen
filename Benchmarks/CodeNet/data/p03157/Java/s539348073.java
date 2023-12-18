
// LM10: The next Ballon d'Or
import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    static class FastReader {
        private InputStream mIs;
        private byte[] buf = new byte[1024];
        private int curChar, numChars;

        public FastReader() {
            this(System.in);
        }

        public FastReader(InputStream is) {
            mIs = is;
        }

        public int read() {
            if (numChars == -1) throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = mIs.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public long l() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int i() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double d() throws IOException {
            return Double.parseDouble(next());
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        public void scanIntArr(int[] arr) {
            for (int li = 0; li < arr.length; ++li) {
                arr[li] = i();
            }
        }

        public void scanLongArr(long[] arr) {
            for (int i = 0; i < arr.length; ++i) {
                arr[i] = l();
            }
        }

        public void shuffle(int[] arr) {
            for (int i = arr.length; i > 0; --i) {
                int r = (int) (Math.random() * i);
                int temp = arr[i - 1];
                arr[i - 1] = arr[r];
                arr[r] = temp;
            }
        }
    }

    static int ways;
    static int [][] dp;
    public static void main(String[] args) throws IOException {
        /*
Sample Input 1
Copy
3 3
.#.
..#
#..
Sample Output 1
Copy
10
*/
        PrintWriter pw = new PrintWriter(System.out);
        FastReader fr = new FastReader();
        int t = 1;
        for (int ti = 0; ti < t; ++ti)
        {
            int h=fr.i();
            int w=fr.i();
            char [][] arr=new char[h][w];
            dp=new int[h][w];
            for(int hi=0;hi<h;++hi)
            {
                arr[hi]=fr.nextLine().toCharArray();
            }
            ways=0;
            for(int hi=0;hi<h;++hi)
            {
                for(int wi=0;wi<w;++wi)
                {
                    if(arr[hi][wi]=='.')
                    {
                        boolean [][] visited=new boolean [h][w];
                        visited[hi][wi]=true;
                        if(hi-1>=0 && arr[hi-1][wi]=='#')
                        {
                            recursion(arr,hi-1,wi,'.',visited);
                        }
                        if(hi+1<arr.length && arr[hi+1][wi]=='#')
                        {
                            recursion(arr,hi+1,wi,'.',visited);
                        }
                        if(wi-1>=0 && arr[hi][wi-1]=='#')
                        {
                            recursion(arr,hi,wi-1,'.',visited);
                        }
                        if(wi+1<arr[hi].length && arr[hi][wi+1]=='#' && !visited[hi][wi+1])
                        {
                            recursion(arr,hi,wi+1,'.',visited);
                        }
                    }
                }
            }
            for(int hi=0;hi<h;++hi)
            {
                for(int wi=0;wi<arr[hi].length;++wi)
                {
                    ways+=dp[hi][wi];
                }
            }
            pw.println(ways);
        }
        pw.flush();
        pw.close();
    }
    public static void recursion(char [][] arr,int hi,int wi,char c,boolean [][] visited)
    {
            if(visited[hi][wi])
                return;
            if(arr[hi][wi]=='#')
            {
                ++dp[hi][wi];
            }
            c=arr[hi][wi];
            visited[hi][wi]=true;
            if(hi-1>=0 && arr[hi-1][wi]!=c && !visited[hi-1][wi])
            {
                recursion(arr,hi-1,wi,'.',visited);
            }
            if(hi+1<arr.length && arr[hi+1][wi]!=c && !visited[hi+1][wi])
            {
                recursion(arr,hi+1,wi,'.',visited);
            }
            if(wi-1>=0 && arr[hi][wi-1]!=c && !visited[hi][wi-1])
            {
                recursion(arr,hi,wi-1,'.',visited);
            }
            if(wi+1<arr[hi].length && arr[hi][wi+1]!=c && !visited[hi][wi+1])
            {
                recursion(arr,hi,wi+1,'.',visited);
            }
    }

}