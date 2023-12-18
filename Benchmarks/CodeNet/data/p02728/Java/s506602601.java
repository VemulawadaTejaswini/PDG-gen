import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
    static final long DIV = 1000000007;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        Node[] tree = new Node[n];
        long[] inv = new long[n+1];
        long[] kai = new long[n+1];
        for (int i = 0; i < tree.length; i++) {
            tree[i] = new Node(i);
        }
        for (int i = 1; i < inv.length; i++) {
            inv[i] = inverseElement(i, DIV);
        }
        kai[0] = 1;
        for (int i = 1; i < kai.length; i++) {
            kai[i] = kai[i-1] * i;
            kai[i] %= DIV;
        }

        HashMap<Long[], Long> convres = new HashMap<Long[], Long>();

        for (int i = 0; i < n-1; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            tree[a].setNext(b);
            tree[b].setNext(a);
        }

        for (int i = 0; i < tree.length; i++) {
            tree[i].initNumFrom();
        }

        for (int i = 0; i < tree.length; i++) {
            System.out.println((tree[i].calcNum(-1, tree, inv, kai))[1]);
        }


    }

    public static long inverseElement(long a, long n){
        long b = n, u=1, v=0;
        while(b > 0) {
            long t = a/b;
            a -= t*b;
            u -= t*v;
            //swap
            t = a;
            a = b;
            b = t;
            t = u;
            u = v;
            v = t;
        }
        u = u % n;
        if(u < 0) u += n;
        return u;
    }

    private static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte())
                return buffer[ptr++];
            else
                return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr]))
                ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext())
                throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            if (!hasNext())
                throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
                throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

}

class Node{
    static final long DIV = 1000000007;
    int id;
    ArrayList<Integer> next;
    HashMap<Integer, Long> patfrom;
    HashMap<Integer, Long> numfrom;

    public Node(int id){
        this.id = id;
        next = new ArrayList<Integer>();
    }

    public void setNext(int mnext){
        next.add(mnext);
    }

    public void initNumFrom(){
        numfrom = new HashMap<Integer, Long>();
        patfrom = new HashMap<Integer, Long>();
    }

    public long[] calcNum(int from, Node[] tree, long[] inv, long[] kai){
        long[] ret = new long[]{1, 1};
        if(from != -1 && patfrom.containsKey(from)){
            ret[0] = numfrom.get(from);
            ret[1] = patfrom.get(from);
        }else{
            ArrayList<Integer> nextnum = new ArrayList<Integer>();
            for (int i = 0; i < next.size(); i++) {
                if(next.get(i) == from) continue;
                long[] mret = tree[next.get(i)].calcNum(id, tree, inv, kai);
                nextnum.add((int)mret[0]);
                ret[0] += mret[0];
                ret[1] *= mret[1];
                ret[0] %= DIV;
                ret[1] %= DIV;
            }

            int sum = (int)(ret[0] - 1);
            ret[1] *= kai[sum];
            ret[1] %= DIV;
            for (int i = 0; i < nextnum.size(); i++) {
                int mnext = nextnum.get(i);
                ret[1] *= inverseElement(kai[mnext], DIV);
                ret[1] %= DIV;
            }

            if(from!= -1){
                numfrom.put(from, ret[0]);
                patfrom.put(from, ret[1]);
            }
        }
        return ret;
    }

    public static long inverseElement(long a, long n){
        long b = n, u=1, v=0;
        while(b > 0) {
            long t = a/b;
            a -= t*b;
            u -= t*v;
            //swap
            t = a;
            a = b;
            b = t;
            t = u;
            u = v;
            v = t;
        }
        u = u % n;
        if(u < 0) u += n;
        return u;
    }

    private long calcConv(long a, long b, long[] inv, HashMap<Long[], Long> convres){
        Long[] c = new Long[]{a, b};
        if(convres.containsKey(c)){
            return convres.get(c);
        }

        long ret = 1;
        b = Math.min(b, a-b);
        for (int i = 0; i < b; i++) {
            ret *= a-i;
            ret %= DIV;
            ret *= inv[i+1];
            ret %= DIV;
        }
        convres.put(c, ret);

        return ret;
    }
}
