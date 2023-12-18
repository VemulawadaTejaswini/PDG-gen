import java.math.BigInteger;
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
        int N = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            for (int k = 0; k < 100; k++)
                if (k * num + 1 <= D)
                    ans++;
                else
                    break;
        }
        System.out.println(ans+X);
    }

    public static void main(String[] args) {
        new Main();
    }
}
