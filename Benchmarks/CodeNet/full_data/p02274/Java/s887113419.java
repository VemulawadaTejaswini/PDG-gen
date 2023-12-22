import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import java.util.*;

public class Main {
    static int N;
    static int[] bit = new int[100000010];

    public static void add(int a, int w) {
        for (int i=a;i<=N;i+=i&(-i)) {
            bit[i]+=w;
        }
    }

    public static int sum(int a) {
        int ret = 0;
        for (int i=a;i>0;i-=i&(-i)) {
            ret+=bit[i];
        }
        return ret;
    }

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int n = in.nextInt();
        N = n;
        long ans = 0L;
        int[] a = new int[n];
        ArrayList<int[]> list = new ArrayList<int[]>();
        for (int i=0;i<n;i++) {
            int b = in.nextInt();
            int[] c = {b, i+1};
            list.add(c);
        }
        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        };
        Collections.sort(list, comparator);
        for (int i=0;i<n;i++) {
            a[i] = list.get(i)[1];
        }

        for (int i=0;i<n;i++) {
            add(a[i], 1);
            ans += i+1-sum(a[i]);
        }
        // out.println(Arrays.toString(bit));
        out.println(ans);

        out.close();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

