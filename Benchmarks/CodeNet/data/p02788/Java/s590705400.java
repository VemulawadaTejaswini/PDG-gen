import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        long D = sc.nextLong();
        long A = sc.nextLong();
        ArrayDeque<Entry<Long, Long>> dex = new ArrayDeque<Entry<Long, Long>>();
        long del = 0;
        ArrayList<Entry<Long, Long>> list = new ArrayList<Entry<Long, Long>>(N);
        for (int i = 0; i < N; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            list.add(new SimpleEntry<Long, Long>(a, b));
        }
        Collections.sort(list, Comparator.comparing(Entry<Long, Long>::getKey));
        for (int i = 0; i < N; i++) {
            Entry<Long, Long> entry = list.get(i);
            long pos = entry.getKey() + D;
            if (!dex.isEmpty()) {
                while (dex.peek().getKey() < entry.getKey())
                    del -= dex.poll().getValue();
            }
            long h = entry.getValue() - del;
            long cnt = h / A + (h % A != 0 ? 1 : 0);
            if (h > 0 && cnt > 0) {
                ans += cnt;
                del += cnt * A;
                dex.add(new SimpleEntry<Long, Long>(pos + D, cnt));
                System.err.println(pos + " " + del + " " + h);
            }
        }
        System.out.println(ans);
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
}