import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

public class Main implements Runnable {
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public int nextInt() {
            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
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

        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

    public static void main(String args[]) throws Exception {
        new Thread(null, new Main(), "Main", 1 << 26).start();
    }

     long modPow(long a, long p, long m) {
        if (a == 1) return 1;
        long ans = 1;
        while (p > 0) {
            if (p % 2 == 1) ans = (ans * a) % m;
            a = (a * a) % m;
            p >>= 1;
        }
        return ans;
    }

     long modInv(long a, long m) {
        return modPow(a, m - 2, m);
    }


    long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }



    public void run() {
        InputReader sc = new InputReader(System.in);
        // Scanner sc=new Scanner(System.in);
        //  Random sc=new Random();
        PrintWriter out = new PrintWriter(System.out);


        int h=sc.nextInt();
        int w=sc.nextInt();
        int n=sc.nextInt();

        HashSet<Long> hs=new HashSet<>();
        int a[][]=new int[n][2];
        for (int i = 0; i <n ; i++) {
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
            hs.add(((long)a[i][0]<<32)|(a[i][1]));
        }
        long ans[]=new long[10];
        long total=1l*(h-2)*(w-2);
        HashSet<Long> leftUpper=new HashSet<>();
        for (int i = 0; i <n ; i++) {
            for (int j = -2; j <=2 ; j++) {
                for (int k = -2; k <=2 ; k++) {
                    if((a[i][0]+j)>=1 && (a[i][0]+j)<=h && (a[i][1]+k)>=1 && (a[i][1]+k)<=w && (a[i][0]+j+2)>=1 && (a[i][0]+j+2)<=h && (a[i][1]+k+2)>=1 && (a[i][1]+k+2)<=w) {
                        leftUpper.add(((long)(a[i][0] + j)<<32| a[i][1] + k));
                    }
                }
            }
        }
        for(long P:leftUpper){
            long y=P&((1l<<32)-1);
            P>>=32;
            long x=P;
            ans[f(x,y,hs)]++;
        }
        for (int i = 1; i <10 ; i++) {
            total-=ans[i];
        }
        out.println(total);
        for (int i = 1; i <10 ; i++) {
            out.println(ans[i]);
        }


        out.close();

    }


    int f(long x,long y,HashSet<Long> h){
        int ans=0;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if(h.contains(((x+i)<<32)|(y+j)))ans++;
            }
        }
        return ans;
    }


}