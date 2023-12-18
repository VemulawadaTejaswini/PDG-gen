/**
 * @author derrick20
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt();
        String S = sc.next();
        long[] dpPrev = new long[N + 1];
        // A state is, for the current position in the permutation,
        // and many available seats above and below me, how many ways to REACH
        // So, this is a PULL-DP. Where we take the previous distribution,
        // then move it to some other form! The actual numbers don't matter!

        // Base case, we choose any place, thus losing the first spot
        for (int below = 0; below < N; below++) {
            // The total remaining spots is N - 1, after this first case
            dpPrev[below]++;
        }
//        System.out.println(Arrays.toString(dpPrev));
        // Now, we transition N - 1 times, so that no more is left
        for (int pos = 0; pos < N - 1; pos++) {
            long[] dpNext = new long[N + 1];
            // Prefix sum optimization
            int remaining = N - 1 - pos;
            int maxBelow = remaining - 1;
            if (S.charAt(pos) == '<') {
                // We need to move up!
                // We will shift to have any number of below to anything
                // all the way up to the MAX below
                // [currBelow, maxBelow]

                for (int below = 0; below <= remaining; below++) {
                    dpNext[below] = addSelf(dpNext[below], dpPrev[below]);
                    dpNext[maxBelow + 1] = subSelf(dpNext[maxBelow + 1], dpPrev[below]);
                }
            }
            else {
                // We are moving down!
                // So, all smaller below values will be incremented
                // [0, below - 1], since we can't keep the SAME below,
                // if we necessarily lose one at least
                for (int below = 0; below <= remaining; below++) {
                    dpNext[0] = addSelf(dpNext[0], dpPrev[below]);
                    dpNext[below] = subSelf(dpNext[below], dpPrev[below]);
                }
            }
            for (int i = 1; i < remaining; i++) {
                dpNext[i] = addSelf(dpNext[i], dpNext[i - 1]);
            }
            for (int i = 0; i < remaining; i++) {
                dpPrev[i] = dpNext[i];
            }
//            System.out.println(Arrays.toString(dpPrev));
        }
        out.println(dpPrev[0]);
        out.close();
    }

    static long mod = (long) 1e9 + 7;
    static long addSelf(long val, long add) {
        val += add;
        if (val >= mod) {
            val -= mod;
        }
        return val;
    }

    static long subSelf(long val, long sub) {
        val -= sub;
        if (val < 0) {
            val += mod;
        }
        return val;
    }

    static class FastScanner {
        public int BS = 1<<16;
        public char NC = (char)0;
        byte[] buf = new byte[BS];
        int bId = 0, size = 0;
        char c = NC;
        double cnt = 1;
        BufferedInputStream in;

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