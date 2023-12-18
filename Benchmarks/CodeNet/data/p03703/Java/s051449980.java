import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        long k = sc.nextLong();
        long [] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        long [] pref = new long[n + 1];
        for (int i = 1; i <= n; i++) pref[i] = pref[i - 1] + a[i - 1];
        ArrayList<Pair> p = new ArrayList<>();
        for (int i = 0; i <= n; i++) p.add(new Pair(i, pref[i] - k * i));
        Collections.sort(p, (o1, o2) -> {
            if (o1.x == o2.x) return Integer.compare(o1.i, o2.i);
            else return Long.compare(o1.x, o2.x);
        });
        for (int i = 0; i < p.size(); i++) p.get(i).idx = i;
        Collections.sort(p, Comparator.comparingInt(x -> x.i));
        RangeTree seg = new RangeTree(n + 2);
        long res = 0;
        for (int i = 0; i < p.size(); i++) {
            res += seg.sumQuery(0, p.get(i).idx);
            seg.update(p.get(i).idx, p.get(i).idx, 1);
        }
        out.println(res);
        out.close();
    }

    static class Pair {
        int i; long x; int idx;
        Pair(int i, long x) {
            this.i = i; this.x = x;
        }
    }

    static class RangeTree {
        private long[] max;
        private long[] min;
        private long[] lazy;
        private long[] sum;
        private int size;
        public RangeTree(int size) {
            this.size = size;
            max = new long[4*size];
            min = new long[4*size];
            sum = new long[4*size];
            lazy = new long[4*size];
        }
        public void update(int l, int r, int inc) {
            update(1, 0, size-1, l, r, inc);
        }
        private void pushDown(int index, int l, int r) {
            min[index] += lazy[index];
            max[index] += lazy[index];
            sum[index] += lazy[index] * (r-l+1);
            if(l != r) {
                lazy[2*index] += lazy[index];
                lazy[2*index+1] += lazy[index];
            }
            lazy[index] = 0;
        }
        private void pullUp(int index, int l, int r) {
            int m = (l+r)/2;
            min[index] = Math.min(evaluateMin(2*index, l, m), evaluateMin(2*index+1, m+1, r));
            max[index] = Math.max(evaluateMax(2*index, l, m), evaluateMax(2*index+1, m+1, r));
            sum[index] = evaluateSum(2*index, l, m) + evaluateSum(2*index+1, m+1, r);
        }
        private long evaluateSum(int index, int l, int r) {
            return sum[index] + (r-l+1)*lazy[index];
        }
        private long evaluateMin(int index, int l, int r) {
            return min[index] + lazy[index];
        }
        private long evaluateMax(int index, int l, int r) {
            return max[index] + lazy[index];
        }
        private void update(int index, int l, int r, int left, int right, int inc) {
            if(r < left || l > right) return;
            if(l >= left && r <= right) {
                lazy[index] += inc;
                return;
            }
            pushDown(index, l, r);
            int m = (l+r)/2;
            update(2*index, l, m, left, right, inc);
            update(2*index+1, m+1, r, left, right, inc);
            pullUp(index, l, r);
        }
        public long minQuery(int l, int r) {
            return minQuery(1, 0, size-1, l, r);
        }
        private long minQuery(int index, int l, int r, int left, int right) {
            if(r < left || l > right) return Long.MAX_VALUE;
            if(l >= left && r <= right) {
                return evaluateMin(index, l, r);
            }
            pushDown(index, l, r);
            int m = (l+r)/2;
            long ret = Long.MAX_VALUE;
            ret = Math.min(ret, minQuery(2*index, l, m, left, right));
            ret = Math.min(ret, minQuery(2*index+1, m+1, r, left, right));
            pullUp(index, l, r);
            return ret;
        }
        public long maxQuery(int l, int r) {
            return maxQuery(1, 0, size-1, l, r);
        }
        private long maxQuery(int index, int l, int r, int left, int right) {
            if(r < left || l > right) return Long.MIN_VALUE;
            if(l >= left && r <= right) {
                return evaluateMax(index, l, r);
            }
            pushDown(index, l, r);
            int m = (l+r)/2;
            long ret = Long.MIN_VALUE;
            ret = Math.max(ret, maxQuery(2*index, l, m, left, right));
            ret = Math.max(ret, maxQuery(2*index+1, m+1, r, left, right));
            pullUp(index, l, r);
            return ret;
        }
        public long sumQuery(int l, int r) {
            return sumQuery(1, 0, size-1, l, r);
        }
        private long sumQuery(int index, int l, int r, int left, int right) {
            if(r < left || l > right) return 0;
            if(l >= left && r <= right) {
                return evaluateSum(index, l, r);
            }
            pushDown(index, l, r);
            int m = (l+r)/2;
            long ret = 0;
            ret += sumQuery(2*index, l, m, left, right);
            ret += sumQuery(2*index+1, m+1, r, left, right);
            pullUp(index, l, r);
            return ret;
        }
    }




    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}