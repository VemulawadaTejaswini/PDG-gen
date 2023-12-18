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
        Bag left = new Bag();
        Bag right = new Bag();
        Interval[] intervals = new Interval[N];
        for (int i = 0; i < N; i++) {
            int lo = sc.nextInt();
            int hi = sc.nextInt();
            intervals[i] = new Interval(lo, hi);
            right.loFreq.merge(lo, 1, Integer::sum);
            right.hiFreq.merge(hi, 1, Integer::sum);
        }
        Arrays.sort(intervals);
        int ans = 0;
        // Sweep through, transferring from right bag to left
        for (int i = 0; i < N; i++) {
            int lo = intervals[i].lo;
            int hi = intervals[i].hi;
            left.loFreq.merge(lo, 1, Integer::sum);
            left.hiFreq.merge(hi, 1, Integer::sum);

            right.loFreq.merge(lo, -1, Integer::sum);
            if (right.loFreq.get(lo) == 0) {
                right.loFreq.remove(lo);
            }
            right.hiFreq.merge(hi, -1, Integer::sum);
            if (right.hiFreq.get(hi) == 0) {
                right.hiFreq.remove(hi);
            }

            if (left.loFreq.size() > 0 && right.loFreq.size() > 0) {
                // Now compute answer! But both bags must be size >= 1
                // Choose the most limiting of each boundary, i.e.
                // highest min, lowest max
                int leftAns = Math.max(0, left.hiFreq.firstKey() - left.loFreq.lastKey() + 1);
                int rightAns = Math.max(0, right.hiFreq.firstKey() - right.loFreq.lastKey() + 1);
                ans = Math.max(ans, leftAns + rightAns);
            }
        }
        out.println(ans);

        out.close();
    }

    static class Bag {
        TreeMap<Integer, Integer> loFreq, hiFreq;
        public Bag() {
            loFreq = new TreeMap<>();
            hiFreq = new TreeMap<>();
        }
    }

    static class Interval implements Comparable<Interval> {
        int lo, hi;
        public Interval(int l, int h) {
            lo = l; hi = h;
        }
        public int compareTo(Interval i2) {
            // We want the intervals to be close together
            return lo - i2.lo != 0 ? lo - i2.lo : hi - i2.hi;
        }
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