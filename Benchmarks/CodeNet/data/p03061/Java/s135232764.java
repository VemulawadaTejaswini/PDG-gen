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

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        int[] A = new int[N];
        SegmentTree st = new SegmentTree(N);
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            st.update(i, A[i]);
        }
        int check;
        check = st.getIn(0, N-1);
        // System.out.println(check);
        ans = Math.max(ans,check);
        check = st.getIn(1, N);
        // System.out.println(check);
        ans = Math.max(ans,check);
        for (int i = 1; i < N-1; i++) {
            check = gcd(st.getIn(0, i),st.getIn(i+1, N));
            // System.out.println(check);
            ans = Math.max(ans,check);
        }

        
        
        System.out.println(ans);
    }

    static int gcd(int m, int n) {
        if (m < n)
            return gcd(n, m);
        if (n == 0)
            return m;
        return gcd(n, m % n);
    }

    public static void main(String[] args) {
        new Main();
    }
}

class SegmentTree {
    int[] data;
    int size;
    int rawsize;
    int rawindex;

    SegmentTree(int size) {
        this.size = size;
        int n = 2;
        while (n < size)
            n <<= 1;
        rawsize = n;
        rawindex = n - 1;
        n = n * 2 - 1;
        data = new int[n];
    }

    void update(int index, int val) {
        data[rawindex + index] = val;
        innerUpdate((rawindex + index - 1) / 2);
    }

    private void innerUpdate(int index) {
        /* structing tree */
        data[index] = gcd(data[index * 2 + 1], data[index * 2 + 2]);
        if (index == 0)
            return;
        innerUpdate((index - 1) / 2);
    }

    int getIn(int left, int right) {
        return innerGetIn(left, right, 0, 0, rawsize);
    }

    static int gcd(int m, int n) {
        if (m < n)
            return gcd(n, m);
        if (n == 0)
            return m;
        return gcd(n, m % n);
    }

    private int innerGetIn(int left, int right, int index, int l, int r) {
        if (r <= left || right <= l)
            throw new Error(String.format("%d %d - %d - %d %d", left,right,index,l,r));
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
            /* restruct here */
            return gcd(lm, rm);
        }
    }

    int getAt(int index) {
        return data[rawindex + index];
    }
}
