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

    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static long modPow(long a, long p, long m) {
        if (a == 1) return 1;
        long ans = 1;
        while (p > 0) {
            if (p % 2 == 1) ans = (ans * a) % m;
            a = (a * a) % m;
            p >>= 1;
        }
        return ans;
    }

    static long modInv(long a, long m) {
        return modPow(a, m - 2, m);
    }

    static long sol_x, sol_y, gcd_a_b;

    static void extendedEuclid(long a, long b) {
        if (b == 0) {
            gcd_a_b = a;
            sol_x = 1;
            sol_y = 0;
        } else {
            extendedEuclid(b, a % b);
            long temp = sol_x;
            sol_x = sol_y;
            sol_y = temp - (a / b) * sol_y;
        }
    }

    long modInverse(long a, long prime)
    {
        a = a % prime;
        for (int x=1; x<prime; x++)
            if ((a*x) % prime == 1)
                return x;

        return -1;
    }

    static class Bhavansort {
        Random random;

        Bhavansort(int a[]) {
            randomArray(a);
            sort(a);
        }

        Bhavansort(long a[]) {
            randomArray(a);
            sort(a);
        }

        static int[] sort(int a[]) {
            Arrays.sort(a);
            return a;
        }

        static long[] sort(long a[]) {
            Arrays.sort(a);
            return a;
        }

        void randomArray(long a[]) {
            int n = a.length;
            for (int i = 0; i < n; i++) {
                int p = random.nextInt(n) % n;
                long tm = a[i];
                a[i] = a[p];
                a[p] = tm;
            }
        }

        void randomArray(int a[]) {
            int n = a.length;
            for (int i = 0; i < n; i++) {
                int p = random.nextInt(n) % n;
                int tm = a[i];
                a[i] = a[p];
                a[p] = tm;
            }
        }
    }


    public void run() {
        InputReader sc = new InputReader(System.in);
        //Scanner sc=new Scanner(System.in);
        // Random rn=new Random();
        PrintWriter out = new PrintWriter(System.out);


        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }

        int rl[][]=new int[n][];
        for (int i = 0; i <n ; i++) {
            rl[n-1-i]=new int[i+1];
            for (int j = 0; j <=i ; j++) {
                rl[n-1-i][j]=a[n-1-j];
            }
            Arrays.sort(rl[n-1-i]);
        }


        int lr[][]=new int[n][];
        for (int i = 0; i <n ; i++) {
            lr[i]=new int[i+1];
            for (int j = 0; j <=i ; j++) {
                lr[i][j]=a[j];
            }
            Arrays.sort(lr[i]);
        }

  /*     for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i ; j++) {
                out.print(lr[i][j]+" ");
            }
            out.println();
        }

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i ; j++) {
                out.print(rl[n-1-i][j]+" ");
            }
            out.println();
        }
*/


        int pre[]=new int[n];
        pre[0]=a[0];
        for (int i = 1; i <n ; i++) {
            pre[i]=pre[i-1]+a[i];
        }

        int suf[]=new int[n];
        suf[n-1]=a[n-1];
        for (int i = n-2; i >=0 ; i--) {
            suf[i]=suf[i+1]+a[i];
        }

        int ans=0;

        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(i+1+(n-1-j+1)<=k) {
                    int sum = (pre[i]) + (suf[j]);
               //    out.println(i+" "+j+" "+sum+" "+pre[i]+" "+suf[j]);
                    int r =k-(i+1+n-1-j+1);
                    int left=0,right=0;
                    for (int l = 0; l <r ; l++) {
                        if(left<lr[i].length && right<rl[right].length){
                            if(lr[i][left]>0 && rl[n-1-j][right]>0)break;
                            else if(lr[i][left]>0 && rl[n-1-j][right]<0){
                                sum-=rl[n-1-j][right];
                                right++;
                            }
                            else if(lr[i][left]<0 && rl[n-1-j][right]>0){
                                sum-=lr[i][left];
                                left++;
                            }
                            else{
                                if(lr[i][left]<rl[n-1-j][right]){
                                    sum-=lr[i][left];
                                    left++;
                                }
                                else{
                                    sum-=rl[n-1-j][right];
                                    right++;
                                }
                            }
                        }
                        else{
                            while(left<lr[i].length  && lr[i][left]<0){
                                sum-=lr[i][left];
                                left++;
                            }
                            while (right<rl[n-1-j].length && rl[n-1-j][right]<0){
                                sum-=rl[n-1-j][right];
                                right++;
                            }
                        }
                    }
               //    out.println(sum);
                    ans=Math.max(ans,sum);
                }
            }
        }

        for (int i = 0; i <Math.min(k,n) ; i++) {
            int sum=pre[i];
            int r=(k-(i+1));
            int left=0;
            for (int j = 0; j <r ; j++) {
                if(left<lr[i].length && lr[i][left]<0){
                    sum-=lr[i][left];
                    left++;
                }
            }
         //   out.println(i+" "+sum);
            ans=Math.max(ans,sum);
        }
      //  out.println(ans);

        for (int i = 0; i <Math.min(k,n) ; i++) {
            int sum=suf[n-1-i];
           // out.println("suf "+sum);
            int r=(k-(i+1));
            int left=0;
            for (int j = 0; j <r ; j++) {
                if(left<rl[n-1-i].length && rl[n-1-i][left]<0){
                   // out.print(rl[n-1-i][left]+" ");
                    sum-=rl[n-1-i][left];
                    left++;
                }
            }
           // out.println();
            //out.println(sum);
            ans=Math.max(ans,sum);
        }

        out.println(ans);

        out.close();
    }




 }