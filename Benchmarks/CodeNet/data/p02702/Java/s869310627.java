/**
 * @author derrick20
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);


        int P = 2019;
        char[] str = sc.next().toCharArray();
        int N = str.length;
        int[] digits = new int[N + 1];
        for (int i = 0; i < N; i++) {
            digits[i + 1] = Character.getNumericValue(str[i]);
        }

        if (P == 2 || P == 5) {
            // This means that our assumption of subtracting two
            // suffixes and dividing by 10^blah isn't always equivalent
            // to if we didn't divide by 10^blah. So, our DP doesn't work!

            long ans = 0;
            // LUCKILY, these cases are easy to handle without DP.
            for (int len = 1; len <= N; len++) {
                if (digits[len] % P == 0) {
                    // we can go from this position and end anywhere
                    // below us, at each spot along our length!
                    ans += len;
                }
            }
            out.println(ans);
        }
        else {
            int[] residueDP = new int[P];
            // store number of SUFFIXES with a given residue.
            // We can definitely enumerate all N of those, and we leverage
            // the fact that we can SUBTRACT suffixes in a way that
            // allows us to generate all valid substrings! This will be called
            // the substring from suffix trick!
            residueDP[0] = 1; // we can always build on top of the empty suffix!
            // Now we create a running suffix
            int suffix = 0;
            int shift = 1;
            long ans = 0;
            for (int pos = N; pos >= 1; pos--) {
                suffix = (suffix + shift * digits[pos]) % P;
                ans += residueDP[suffix]; // build off ALL old ones, subtracting to get 0!
                residueDP[suffix]++; // update it!
                shift = (shift * 10) % P;
//                System.out.println(Arrays.toString(residueDP));
            }
            out.println(ans);
        }

        out.close();
    }

    static class FastScanner {
        private int BS = 1<<16;
        private char NC = (char)0;
        private byte[] buf = new byte[BS];
        private int bId = 0, size = 0;
        private char c = NC;
        private double cnt = 1;
        private BufferedInputStream in;

        public FastScanner() {
            in = new BufferedInputStream(System.in, BS);
        }

        public FastScanner(String s) {
            try {
                in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
            }
            catch (Exception e) {
                in = new BufferedInputStream(System.in, BS);
            }
        }

        private char getChar(){
            while(bId==size) {
                try {
                    size = in.read(buf);
                }catch(Exception e) {
                    return NC;
                }
                if(size==-1)return NC;
                bId=0;
            }
            return (char)buf[bId++];
        }

        public int nextInt() {
            return (int)nextLong();
        }

        public int[] nextInts(int N) {
            int[] res = new int[N];
            for (int i = 0; i < N; i++) {
                res[i] = (int) nextLong();
            }
            return res;
        }

        public long[] nextLongs(int N) {
            long[] res = new long[N];
            for (int i = 0; i < N; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public long nextLong() {
            cnt=1;
            boolean neg = false;
            if(c==NC)c=getChar();
            for(;(c<'0' || c>'9'); c = getChar()) {
                if(c=='-')neg=true;
            }
            long res = 0;
            for(; c>='0' && c <='9'; c=getChar()) {
                res = (res<<3)+(res<<1)+c-'0';
                cnt*=10;
            }
            return neg?-res:res;
        }

        public double nextDouble() {
            double cur = nextLong();
            return c!='.' ? cur:cur+nextLong()/cnt;
        }

        public String next() {
            StringBuilder res = new StringBuilder();
            while(c<=32)c=getChar();
            while(c>32) {
                res.append(c);
                c=getChar();
            }
            return res.toString();
        }

        public String nextLine() {
            StringBuilder res = new StringBuilder();
            while(c<=32)c=getChar();
            while(c!='\n') {
                res.append(c);
                c=getChar();
            }
            return res.toString();
        }

        public boolean hasNext() {
            if(c>32)return true;
            while(true) {
                c=getChar();
                if(c==NC)return false;
                else if(c>32)return true;
            }
        }
    }
}
