import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ESumOfGcdOfTuplesHard solver = new ESumOfGcdOfTuplesHard();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESumOfGcdOfTuplesHard {
        final long mod = (long) 1e9 + 7;
        long[] fac;

        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), k = s.nextInt();
            int MXSIZE = k + 1;
            long[] coprimes = new long[MXSIZE], p = new long[MXSIZE];
            fac = new long[MXSIZE];
            fac[0] = 1;
            for (int i = 1; i < MXSIZE; i++) {        //Calculate factorials
                fac[i] = fac[i - 1] * i;
                fac[i] %= mod;
            }
            ArrayList<Integer>[] factors = new ArrayList[MXSIZE];
            for (int i = 1; i < MXSIZE; i++) {
                factors[i] = new ArrayList<>();
                factors[i].add(1);
            }
            for (int i = 2; i < MXSIZE; i++) {        //Store Factors
                for (int j = i << 1; j < MXSIZE; j += i) {
                    factors[j].add(i);
                }
            }
        /*for(int i = k; i < MXSIZE; i++){		//Actual dp solution
            for(int f: factors[i]){
                coprimes[i] -= coprimes[i / f]; //Subtract sets whose gcd is NOT 1
                coprimes[i] += mod;
                coprimes[i] %= mod;
            }
            coprimes[i] += combi(i - 1, k - 1); //Adding all possible combitions. This is added at last because 1 is a factor, and i don't want it to get subtracted by
            coprimes[i] %= mod;			 	   //itself in previous loop, which will result in its value becoming zero
            for(int f: factors[i]){
                p[i] += coprimes[i / f] * f;		//Calculate p and q, p being the sum of gcd and q is total sets
                p[i] %= mod;					//it will be multiplied in both p and q, thus effectively cancelling out :)
            }
        }
        //Now coprime[i] contains total sets which have integer 'i' in it and have gcd zero
        for(int i = k; i < MXSIZE; i++){
            p[i] += p[i - 1];	//Calculate sum of all GCDs till i
            p[i] %= mod;
        }*/
            long ans = 0;
            for (int i = 1; i <= k; i++) {
                for (int f : factors[i]) {
                    coprimes[i] -= coprimes[i / f]; //Subtract sets whose gcd is NOT 1
                    coprimes[i] += mod;
                    coprimes[i] %= mod;
                }
                coprimes[i] += (func.power(i, n, mod) - func.power(i - 1, n, mod) - 1 + mod) % mod;
                coprimes[i] %= mod;
                for (int f : factors[i]) {
                    p[i] += coprimes[i / f] * f;        //Calculate p and q, p being the sum of gcd and q is total sets
                    p[i] %= mod;                    //it will be multiplied in both p and q, thus effectively cancelling out :)
                }
                p[i] += i;
                p[i] %= mod;
            }
            for (int i = 1; i <= k; i++) {
                ans += p[i];
                ans %= mod;
            }
            w.println(ans);
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
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

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class func {
        public static long power(long x, long y, long p) {
            long res = 1;
            x %= p;
            while (y > 0) {
                if ((y & 1) == 1) {
                    res *= x;
                    res %= p;
                }
                y >>= 1;
                x *= x;
                x %= p;
            }
            return res;
        }

    }
}

