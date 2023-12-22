import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++)A[i]=sc.nextInt();
        SegmentTree st = new SegmentTree(N);
        
        //for(int i=0;i<N;i++)st.update(i, A[i]);
        //int prev = st.getIn(0, K);
        for(int i=K;i<N;i++){
            //int now = st.getIn(i-K, i);
            //System.out.println(now);
            int prev = A[i-K];
            int now = A[i];
            //System.out.println(prev);
            //System.out.println(now);
            System.out.println(prev<now?"Yes":"No");
        }

    }

    public static void main(String[] args) {
        new Main();
    }
}

/*
class SegmentTree {
    int[] data;
    int size;
    int treesize;
    int treedepth;
    int leafstart;

    SegmentTree(int size) {
        this.size = size;
        int n = 2;
        int d = 2;
        while (n < size) {
            n <<= 1;
            d++;
        }
        treesize = n;
        treedepth = d;
        leafstart = n - 1;
        n = n * 2 - 1;
        data = new int[n];
    }

    void update(int index, int val) {
        data[leafstart + index] = val;
        innerUpdate((leafstart + index - 1) / 2);
    }

    private void innerUpdate(int index) {
        data[index] = data[index * 2 + 1]* data[index * 2 + 2];
        if (index == 0)
            return;
        innerUpdate((index - 1) / 2);
    }

    int getIn(int left, int right) {
        if (left == right)
            throw new Error(String.format("%d == %d", left, right));
        return innerGetIn(left, right, 0, 0, treesize);
    }

    private int innerGetIn(int left, int right, int index, int l, int r) {
        // if (r <= left || right <= l)
        // throw new Error(String.format("%d %d - %d - %d %d", left,right,index,l,r));
        if (left <= l && r <= right)
            return data[index];
        int mid = (l + r) / 2;
        if (right <= mid) {
            return innerGetIn(left, right, index * 2 + 1, l, mid);
        } else if (mid <= left) {
            return innerGetIn(left, right, index * 2 + 2, mid, r);
        } else {
            int lm = innerGetIn(left, right, index * 2 + 1, l, mid);
            int rm = innerGetIn(left, right, index * 2 + 2, mid, r);
            return lm* rm;
        }
    }

    int getAt(int index) {
        return data[leafstart + index];
    }

    void printTree() {
        for (int d = 0; d < treedepth; d++) {
            System.err.println(Arrays.toString(Arrays.copyOfRange(data, (1 << d) - 1, (1 << (d + 1)) - 1)));
        }
    }
}
*/