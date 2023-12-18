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
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    Main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();
        int Q = sc.nextInt();
        int[][] dp = new int[N+1][27];
        // dp[0][S[0] - 'a'] = 1;
        for (int i = 1; i <= N; i++) {
            dp[i] = dp[i - 1].clone();
            dp[i][S[i - 1] - 'a']++;
        }
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Character> change = new ArrayList<Character>();
        ArrayList<Character> changed = new ArrayList<Character>();
        // char[] change = new char[N];
        for (int q = 0; q < Q; q++) {
            if (sc.next().equals("1")) {
                int p = sc.nextInt()-1;
                pos.add(p);
                char c = sc.next().charAt(0);
                change.add(c);
                changed.add(S[p]);
                // change[sc.nextInt()]=sc.next().charAt(0);
            } else {
                int a = sc.nextInt() - 1;
                int b = sc.nextInt() - 0;
                int pre = 0;
                // int aft = 0;
                int[] fp = new int[27];
                for (int k = 0; k < 27; k++) {
                    fp[k] = dp[b][k]-dp[a][k];
                    if (fp[k] > 0)
                        pre++;
                }
                System.err.println(Arrays.toString(dp[a]));
                System.err.println(Arrays.toString(dp[b]));
                int sub = 0;
                for (int i = 0; i < change.size(); i++) {
                    char c = change.get(i);
                    if(fp[c-'a']==1)sub++;
                    if(fp[changed.get(i)-'a']==0)sub--;
                }
                System.err.println(pre+","+sub);
                System.out.println(pre+sub);
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public ArrayList<Integer> nextIntList(int n) {
        ArrayList<Integer> a = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++)
            a.add(nextInt());
        return a;
    }

    public ArrayList<Long> nextLongList(int n) {
        ArrayList<Long> a = new ArrayList<Long>(n);
        for (int i = 0; i < n; i++)
            a.add(nextLong());
        return a;
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    }
}