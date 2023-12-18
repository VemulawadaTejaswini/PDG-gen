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
        int M = sc.nextInt();
        int[] s = new int[M];
        char[] c = new char[M];
        for (int i = 0; i < M; i++) {
            s[i] = sc.nextInt() - 1;
            c[i] = sc.next().charAt(0);
        }
        for (int i = 0; i <= 999; i++) {
            String nums = String.valueOf(i);
            if (nums.length() != N)
                continue;
            char[] foo = nums.toCharArray();
            int k;
            for (k = 0; k < M; k++) {
                if (foo[s[k]] != c[k]) {
                    break;
                }
            }
            if (k == M) {
                System.out.println(i);
                return;
            }
        }
        System.err.println("no");
        System.out.println(-1);
    }

    public static void main(String[] args) {
        new Main();
    }
}
