import java.util.*;
import java.io.*;

// Computational cost: O( N + Q log N )
// using segment trees for paren depths and # of close parens + 1-pass search

class Main {
    static final int BIG = 2*512*1024;
    static int [] ds;  // depths of open parens (for region-min)
    static int [] ds2; // depths of open parens (for region-max)
    static int [] ods; // depths of parens
    static int [] us;  // lazy updates
    static int [] ss;  // sums of close parens
    static int n;      // # of chars
    static char [] ps; // parens
    static int N;      // # of leaves in each of the trees (i.e., the minimum 2^k >= n)
    static int [] mnx; // the results of min/max-query
    static void out(int [] xs) {
        for(int i = 1, d = 2; i < 2*N; i++) {
            if(i == d) {
                d *= 2;
                System.out.println();
            }
            System.out.print(" " + xs[i]);
        }
        System.out.println();
    }

    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        N = 1;
        for(int i = n; i > 0; i >>= 1, N<<=1 );
        if(2*n == N) N = n;
        ds = new int[2*N];
        ds2 = new int[2*N];
        ods = new int[2*N];
        ss = new int[2*N];
        us = new int[2*N];
        mnx = new int[2];
        for(int i = 0; i < 2*N; i++) {
            us[i] = 0;
            ds[i] = BIG;
            ds2[i] = -BIG;
            ods[i] = BIG;
            ss[i] = 0;
        }
        int q = Integer.parseInt(st.nextToken());
        ps = br.readLine().toCharArray();
        // paren depths & # of closes
        int d = 0;
        for(int i = 0; i < n; i++) {
            if(ps[i] == ')') {
                ods[i+N] = d;
                ds[i+N] = BIG;
                ds2[i+N] = -BIG;
                d--;
                ss[i+N] = 1;
            } else {
                ods[i+N] = d;
                ds[i+N] = d;
                ds2[i+N] = d;
                d++;
            }
        }
        // initialize the internal nodes
        for(int i = N-1; i > 0; i--) {
            ds[i] = Math.min(ds[i*2], ds[i*2+1]);
            ds2[i] = Math.max(ds2[i*2], ds2[i*2+1]);
            ss[i] = ss[i*2] + ss[i*2+1];
        }
        for(int i = 0; i < q; i++) {
            int j = Integer.parseInt(br.readLine()) - 1;
            if(ss[j+N] == 1) {
                open(j);
                int k = rightmost_open_2nd();
                System.out.println(k+1);
                close(k);
            } else {
                close(j);
                int k = leftmost_close();
                System.out.println(k+1);
                open(k);
            }
        }
    }
    static int rightmost_open_2nd() {
        return rightmost_open_2nd_rec(1, 0, N);
    }
    static int rightmost_open_2nd_rec(int k, int l, int r) {
        if(r - l == 1) return k - N;
        if(us[k] != 0) {
            push(2*k  , us[k], l, (l+r)/2);
            push(2*k+1, us[k], (l+r)/2, r);
            us[k] = 0;
        }
        if( ds[2*k+1] <= 1 && 1 <= ds2[2*k+1] ) {
            return rightmost_open_2nd_rec(2*k+1, (l+r)/2, r);
        } else {
            return rightmost_open_2nd_rec(2*k, l, (l+r)/2);
        }
    }
    static int leftmost_close() {
        return leftmost_close_rec(1, 0, N);
    }
    static int leftmost_close_rec(int k, int l, int r) {
        if(r - l == 1) return k - N;
        if( ss[2*k] >= 1 ) {
            return leftmost_close_rec(2*k, l, (l+r)/2);
        } else {
            return leftmost_close_rec(2*k+1, (l+r)/2, r);
        }
    }
    static void open(int j) {
        //ps[j] = '(';
        write_s(j, 0);
        clear(j, 1, 0, N); // path clear (to make ods[N+j] valid);
        write_d(j, ods[N+j]); // put the depth ods[N+j]
        update_region(j+1, n, 1, 2, 0, N);  // update the depths by +2
    }
    static void close(int j) {
        //ps[j] = ')';
        write_s(j, 1);
        write_d(j, BIG); // remove the depth 
        update_region(j+1, n, 1, -2, 0, N);  // update the depths by -2
    }
    static void write_s(int i, int v) {
        i += N;
        ss[i] = v;
        for(i >>=1; i > 0; i >>=1) ss[i] = ss[i*2] + ss[i*2+1];
    }
    static int sum_s(int i, int j, int k, int l, int r) {
        if(r <= i || j <= l) return 0;
        if(i <= l && r <= j) return ss[k];
        int sl = sum_s(i, j, k*2    , l, (l+r)/2);
        int sr = sum_s(i, j, k*2 + 1, (l+r)/2, r);
        return sl + sr;
    }
    static void clear(int i, int k, int l, int r) {
        min_max_d2(i, i+1, k, l, r);
    }
    static void write_d(int i, int v) {
        clear(i, 1, 0, N); // clear the path
        i += N;
        ds[i] = v;
        ds2[i] = v > n ? -v : v;
        for(i >>=1; i > 0; i >>=1) {
            ds[i]  = Math.min(ds[i*2] , ds[i*2+1] );
            ds2[i] = Math.max(ds2[i*2], ds2[i*2+1]);
        }
    }
    static void push(int k, int u, int l, int r) {
        us[k] += u;
        ds[k] += u;
        ds2[k] += u;
        if(l - r == -1) { ods[k] += u; us[k] = 0; }
    }
    static void min_max_d2(int i, int j, int k, int l, int r) {
        if(r <= i || j <= l) return;
        if(us[k] != 0) {
            push(2*k  , us[k], l, (l+r)/2);
            push(2*k+1, us[k], (l+r)/2, r);
            us[k] = 0;
        }
        if(i <= l && r <= j) {
            if(mnx[0] > ds[k])  mnx[0] = ds[k];
            if(mnx[1] < ds2[k]) mnx[1] = ds2[k];
            return;
        }
        min_max_d2(i, j, k*2    , l, (l+r)/2);
        min_max_d2(i, j, k*2 + 1, (l+r)/2, r);
    }
    static void update_region(int i, int j, int k, int v, int l, int r) {
        if(r <= i || j <= l) return;
        if(i <= l && r <= j) {
            push(k, v, l, r);
        } else {
            update_region(i, j, k*2    , v, l, (l+r)/2);
            update_region(i, j, k*2 + 1, v, (l+r)/2, r);
            ds[k]  = Math.min(ds[k*2] , ds[k*2+1] );
            ds2[k] = Math.max(ds2[k*2], ds2[k*2+1]);
        }
    }
}


