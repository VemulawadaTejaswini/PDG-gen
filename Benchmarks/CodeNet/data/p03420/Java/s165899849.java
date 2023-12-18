import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.AbstractMap.SimpleEntry;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += N / i * Math.max(0, i - K);
            ans += Math.max(0, N % i - K + 1);
            // System.err.println(i + " " + N / i * Math.max(0, i - K));
            // System.err.println(i + " " + Math.max(0, N % i - K + 1));
        }
        if (K == 0)
            ans -= N;
        System.out.println(ans);
    }
}
