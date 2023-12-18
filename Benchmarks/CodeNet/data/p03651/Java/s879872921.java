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
        int max = 0;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            A[i] = num;
            max = Math.max(num, max);
        }
        int gcd = A[0];
        for (int i = 1; i < N; i++) {
            gcd = gcd(A[i],gcd);
        }
        if(K<=max && (max-K) % gcd == 0)
        System.out.println("POSSIBLE");
        else
        System.out.println("IMPOSSIBLE");

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
