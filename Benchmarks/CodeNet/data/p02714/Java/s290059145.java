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
        String S = sc.next();
        int rc = 0;
        int gc = 0;
        int bc = 0;
        for (int i = 0; i < N; i++) {
            switch (S.charAt(i)) {
                case 'R':
                    rc++;
                    break;
                case 'G':
                    gc++;
                    break;
                case 'B':
                    bc++;
                    break;
            }
        }
        ans = rc * gc * bc;
        for (int p = 1; p < N; p++) {
            for (int i = 0; i + p + p < N; i++) {
                if (S.charAt(i) != S.charAt(i + p) && S.charAt(i) != S.charAt(i + p + p)
                        && S.charAt(i + p) != S.charAt(i + p + p))
                    ans--;
            }
        }
        System.out.println(Math.max(0,ans));
    }

    public static void main(String[] args) {
        new Main();
    }
}
