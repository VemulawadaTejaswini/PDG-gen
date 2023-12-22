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
    static final long INF = 1 << 60;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextInt();
        long[] A = new long[N];
        long[] B = new long[M];
        long[] Aa = new long[N + 1];
        long[] Bb = new long[M + 1];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }
        Aa[0] = A[0];
        for (int i = 1; i < N; i++) {
            Aa[i] = Aa[i - 1] + A[i];
        }
        Aa[N] = INF;
        Bb[0] = B[0];
        for (int i = 1; i < M; i++) {
            Bb[i] = Bb[i - 1] + B[i];
        }
        Bb[M] = INF;
        int ac = binarySearch(0, N + 1, Aa, K);
        // ans = Math.max(ans, ac + 1);
        for (int i = 0; i <= ac; i++) {
            long asum = Aa[ac - i];
            long rem = K - asum;
            int bc = binarySearch(0, M + 1, Bb, rem);
            ans = Math.max(ans, ac + bc);
        }
        System.out.println(ans);
    }

    static boolean isOK(int index, long[] C, long key) {
        // if (A[index] < key)
        if (C[index] < key)
            return false;
        else
            return true;
    }

    static int binarySearch(int min, int max, long[] C, long key) {
        int ng = min - 1, ok = max;
        while (ok - ng > 1) {
            int mid = ng + (ok - ng) / 2;
            if (isOK(mid, C, key))
                ok = mid;
            else
                ng = mid;
        }
        if (ok == max)
            // return -1;
            throw new Error("all false");
        return ok;
    }

    public static void main(String[] args) {
        new Main();
    }
}
