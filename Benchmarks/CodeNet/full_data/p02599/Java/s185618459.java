import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;


public class Main {
    public static FastReader fs = new FastReader();
    static final int mxn = (int)(1e6+6);
    static PrintWriter out = new PrintWriter(System.out);
    static class query implements Comparable<query>{
        int start,end,idx,block_size;
        query(int s,int e,int i,int bl){
            this.start = s;
            this.end = e;
            this.idx = i;
            this.block_size = bl;
        }
        @Override
        public int compareTo(final query other) {
            final int leftBlockIndex = this.start / block_size;
            final int otherLeftBlockIndex = other.start / block_size;
            return leftBlockIndex - otherLeftBlockIndex != 0
                    ? leftBlockIndex - otherLeftBlockIndex : end - other.end;
        }
    }

    static void solve() {
        StringBuffer output = new StringBuffer();
        int n = fs.nextInt();int qr = fs.nextInt();
        int arr [] = new int [n];
        
        for(int i = 0; i<n; i++){
            arr[i] = fs.nextInt();
        }
        
        int bl_size = (int) Math.sqrt(n);
        query q [] = new query[qr];
        for(int i = 0; i<qr; i++){
            int start = fs.nextInt()-1,end = fs.nextInt()-1,idx = i;
            q[i] = new query(start,end,idx,bl_size);
        }
        Arrays.sort(q);
        //for(int i = 0; i<qr; i++)out.println(q[i].start + " " + q[i].end + " " + q[i].idx);
        int ans [] = new int [qr];
        int fre [] = new int [mxn];
        int previous_left = q[0].start,previous_right = q[0].start;
        int count = 1;
        fre[arr[previous_left]]++;
        for(query ele : q){
            while (previous_left < ele.start) {
                fre[arr[previous_left]]--;
                if (fre[arr[previous_left]] == 0) {
                    count--;
                }
                previous_left++;
            }
            while (previous_left > ele.start) {
                previous_left--;
                fre[arr[previous_left]]++;
                if (fre[arr[previous_left]] == 1) {
                    count++;
                }
            }
            while (previous_right < ele.end) {
                previous_right++;
                fre[arr[previous_right]]++;
                if (fre[arr[previous_right]] == 1) {
                    count++;
                }
            }
            while (previous_right > ele.end) {
                fre[arr[previous_right]]--;
                if (fre[arr[previous_right]] == 0) {
                    count--;
                }
                previous_right--;
            }
            ans[ele.idx] = count;
        }
        for(int i = 0; i<qr; i++)out.println(ans[i]);
    }

    public static void main(String[] args) {
        int t = 1;
        //t = fs.nextInt();
        for(int cs = 1; cs <= t; cs++) {
            solve();
        }
        out.close();
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
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
    }

    static int ceil(int x,int y) {
        return (x % y == 0 ? x / y : (x / y +1));
    }

    static long ceil(long x,long y) {
        return (x % y == 0 ? x / y : (x / y +1));
    }

    static int max(int x,int y) {
        return Math.max(x, y);
    }

    static int min(int x,int y) {
        return Math.min(x, y);
    }

    static long max(long x,long y) {
        return Math.max(x, y);
    }

    static long min(long x,long y) {
        return Math.min(x, y);
    }

    static int min(int a []) {
        int x = 1_000_000_00_9;
        for(int i = 0; i<a.length; i++)x = min(x,a[i]);
        return x;
    }

    static int max(int a []) {
        int x = -1_000_000_00_9;
        for(int i = 0; i<a.length; i++)x = max(x,a[i]);
        return x;
    }

    static long min(long a []) {
        long x = (long)3e18;
        for(int i = 0; i<a.length; i++)x = min(x,a[i]);
        return x;
    }

    static long max(long a []) {
        long x = -(long)3e18;
        for(int i = 0; i<a.length; i++)x = max(x,a[i]);
        return x;
    }

    static int power(int x,int y) {
        int res = 1;
        while(y > 0) {
            if( y % 2 == 1)res = (res * x);
            y >>= 1;
            x = (x * x);
        }
        return res;
    }

    static long power(long x,long y) {
        long res = 1;
        while(y > 0) {
            if( y % 2 == 1)res = (res * x);
            y >>= 1;
            x = (x * x);
        }
        return res;
    }

    static long power(long x,long y,long mod) {
        long res = 1;
        x %= mod;
        while(y > 0) {
            if( y % 2 == 1)res = (res * x) % mod;
            y >>= 1;
            x = (x * x) % mod;
        }
        return res;
    }

    static void intsort(int [] a) {
        List<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i<a.length; i++)temp.add(a[i]);
        Collections.sort(temp);
        for(int i = 0; i<a.length; i++)a[i] = temp.get(i);
    }

    static void longsort(long [] a) {
        List<Long> temp = new ArrayList<Long>();
        for(int i = 0; i<a.length; i++)temp.add(a[i]);
        Collections.sort(temp);
        for(int i = 0; i<a.length; i++)a[i] = temp.get(i);
    }

    static void reverseintsort(int [] a) {
        List<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i<a.length; i++)temp.add(a[i]);
        Collections.sort(temp);
        Collections.reverseOrder();
        for(int i = 0; i<a.length; i++)a[i] = temp.get(i);
    }

    static void reverselongsort(long [] a) {
        List<Long> temp = new ArrayList<Long>();
        for(int i = 0; i<a.length; i++)temp.add(a[i]);
        Collections.sort(temp);
        Collections.reverseOrder();
        for(int i = 0; i<a.length; i++)a[i] = temp.get(i);
    }

    static void intpairsort(intpair [] a) {
        List<intpair> temp = new ArrayList<intpair>();
        for(int i = 0; i<a.length; i++)temp.add(a[i]);
        Collections.sort(temp,(p1,p2) -> {
            if(p1.x == p2.x) return p1.y >= p2.y ? -1 : 1;
            else return p1.x > p2.x ? -1 : 1;
        });
        for(int i = 0; i<a.length; i++)a[i] = temp.get(i);
    }

    static void longpairsort(longpair [] a) {
        List<longpair> temp = new ArrayList<longpair>();
        for(int i = 0; i<a.length; i++)temp.add(a[i]);
        Collections.sort(temp,(p1,p2) -> {
            if(p1.x == p2.x) return p1.y >= p2.y ? -1 : 1;
            else return p1.x > p2.x ? -1 : 1;
        });
        for(int i = 0; i<a.length; i++)a[i] = temp.get(i);
    }

    static class intpair{
        public int x;
        public int y;

        intpair(int a,int b){
            this.x = a;
            this.y = b;
        }

        intpair(){}
    }

    static class longpair{
        public long x;
        public long y;

        longpair(long a,long b){
            this.x = a;
            this.y = b;
        }

        longpair(){}
    }

    static class data{
        public long sum;

        data(long val){
            this.sum = val;
        }

        data(){}

        data combine(data l, data r) {
            data res = new data();
            res.sum = l.sum + r.sum;
            return res;
        }
    }

    static class Seg_Tree extends data{
        public int n;
        data [] seg;

        Seg_Tree(int sz){
            this.n = sz;
            seg = new data[4*n+4];
        }

        void build(long a[], int v, int tl, int tr) {
            if (tl == tr) {
                seg[v] = new data(a[tl]);
            } else {
                int tm = (tl + tr) / 2;
                build(a, v*2, tl, tm);
                build(a, v*2+1, tm+1, tr);
                seg[v] = combine(seg[v*2],seg[v*2+1]);
            }
        }

        void update(int v, int tl, int tr, int pos, long new_val) {
            if (tl == tr) {
                seg[v] = new data(new_val);
            } else {
                int tm = (tl + tr) / 2;
                if (pos <= tm)
                    update(v*2, tl, tm, pos, new_val);
                else
                    update(v*2+1, tm+1, tr, pos, new_val);
                seg[v] = combine(seg[v*2],seg[v*2+1]);
            }
        }

        data query(int v, int tl, int tr, int l, int r) {
            if (l > r)
                return new data(0);
            if (l == tl && r == tr)
                return seg[v];
            int tm = (tl + tr) / 2;
            return combine(query(v*2, tl, tm, l, min(r, tm)),query(v*2+1, tm+1, tr, max(l, tm+1), r));
        }
    }

    static class Bit_Tree{
        static int n;
        static int [] bit;

        Bit_Tree(int sz){
            Bit_Tree.n = sz;
            Bit_Tree.bit = new int[n+1];
        }

        static int child(int x) {
            return x + (x & (-x));
        }

        static int parent(int x) {
            return x - (x & (-x));
        }

        static void build(int [] a) {
            for(int i = 0; i<a.length; i++) {
                int start = i+1;
                while(start <= n) {
                    bit[start] += a[i];
                    start = child(start);
                }
            }
        }

        static void update(int idx,int new_val) {
            idx += 1;
            while(idx <= n) {
                bit[idx] += new_val;
                idx = child(idx);
            }
        }

        static int query(int right) {
            int res = 0;
            while(right > 0) {
                res += bit[right];
                right = parent(right);
            }
            return res;
        }

        static int query(int left,int right) {
            return query(right) - query(left-1);
        }
    }

    public static int gcd(int a, int b)
    {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }

    public static long gcd(long a, long b)
    {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.longValue();
    }
}