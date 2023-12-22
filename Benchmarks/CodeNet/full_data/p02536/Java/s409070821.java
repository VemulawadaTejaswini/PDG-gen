//package src.com.jetman.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/**
 * @description:
 * @author: Jetman
 * @create: 2020-08-29 14:39
 **/
public class Main {

    FastReader sc = new FastReader();
    PrintWriter out = new PrintWriter(System.out);

    long MOD = 998244353L;

    long dp[];

    class Node {
        int l;
        int r;
        int index;
        int ans;
        public Node(int l,int r,int index) {
            this.l = l;
            this.r = r;
            this.index = index;
        }
    }


    int[] fa;
    int fa(int a) {
        return fa[a] == a ? a : (fa[a] = fa(fa[a]));
    }

    private void slove() {

        int n = sc.nextInt();
        int m = sc.nextInt();
        fa = new int[n+1];
        for (int i = 0; i < n; i++) {
            fa[i] = i;
        }
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int lr = fa(l);
            int rr = fa(r);
            if (lr != rr) {
                fa[lr] = rr;
            }
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            set.add(fa(i));
        }
        out.println(set.size()-1);


        out.flush();


    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br =new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st==null || (!st.hasMoreElements()))
            {
                try
                {
                    st =new StringTokenizer(br.readLine());
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }

            }
            return st.nextToken();
        }

        String nextLine() {
            String str ="";

            try
            {
                str =br.readLine();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }

            return str;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next()) ;
        }
    }



    private void build(Map<Integer, List<Integer>> edge, int l, int r) {
        List<Integer> list = edge.getOrDefault(l, new ArrayList<>());
        list.add(r);
        edge.put(l,list);
    }


    public static void main(String[] args) {
        new Main().slove();
    }
}

 class RangeTree {
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
    public void update(int l, int r, long inc) {
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
    private void update(int index, int l, int r, int left, int right, long inc) {
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

class FenwichTree {

    private int[] sums;
    private int[] nums;

    public FenwichTree(int[] nums) {
        this.sums = new int[nums.length + 1];
        this.nums = nums;
        for (int i = 0; i < nums.length; i++) {
            updateBit(i + 1, nums[i]);
        }
    }

    public void update(int i, int val) {
        updateBit(i + 1, val - nums[i]);
        nums[i] = val;
    }

    private void updateBit(int i, int diff) {
        while (i < sums.length) {
            sums[i] += diff;
            i += lowBit(i);
        }
    }

    public int sumRange(int i, int j) {
        return preSum(j + 1) - preSum(i);
    }

    private int preSum(int i) {
        int sum = 0;
        while (i > 0) {
            sum += sums[i];
            i -= lowBit(i);
        }
        return sum;
    }

    private int lowBit(int i) {
        return i & (-i);
    }
}


