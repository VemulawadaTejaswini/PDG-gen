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
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        boolean ret = solve(K, A, B, C);
        System.out.println(ret ? "Yes" : "No");
    }

    boolean solve(int k, int a, int b, int c) {
        if (a < b && b < c)
            return true;
        if (k == 0)
            return false;
        boolean ret = false;
        ret |= solve(k - 1, a * 2, b, c);
        ret |= solve(k - 1, a, b, c * 2);
        ret |= solve(k - 1, a, b * 2, c);
        return ret;
    }

    public static void main(String[] args) {
        new Main();
    }
}
