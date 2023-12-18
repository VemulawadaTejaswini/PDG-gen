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
    static int[] bit = new int[1000010];

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

    public static int get(int k) { // 0_indexed find
        ++k;
        int res = 0;
        int nn = 1; while (nn < (int)N) nn *= 2;
        for (int i = nn / 2; i > 0; i /= 2) {
            if (res + i < (int)N && bit[res + i] < k) {
                k = k - bit[res + i];
                res = res + i;
            }
        }
        return res + 1;
    }

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        N = in.nextInt();
        int D = in.nextInt();
        int A = in.nextInt();
        Integer[] X = new Integer[N];
        // TreeSet<Integer> set = new TreeSet<Integer>();
        int[] H = new int[N];
        ArrayList<int[]> data = new ArrayList<int[]>();
        for (int i=0;i<N;i++) {
            X[i] = in.nextInt();
            H[i] = in.nextInt();
            int[] add = {X[i], H[i], i+1};
            data.add(add);
            // set.add(X[i]);
        }

        Collections.sort(data, (o1, o2)->Integer.compare(o1[0], o2[0]));
        Arrays.sort(X);

        for (int i=0;i<N;i++) {
            int[] rem = data.get(i);
            // System.out.println(Arrays.toString(rem));
            add(rem[2], (rem[1]+A-1)/A);
        }

        long ans = 0L;
        int cnt = 0;
        for (int index=1;index<=N;index++) {
            long minus = sum(index);
            if (index!=1) minus-=sum(index-1);
            if (minus>0) {
                int index_2 = ~Arrays.binarySearch(X, X[index-1]+2*D+1, (o1, o2) -> o1>o2 ? 1 : -1)+1;
                // if (index_2>N) index_2=N;
                // add(index, -(int)minus);
                for (int i = index;i<index_2;i++) {
                    add(i, -(int)minus);
                }
                ans += minus;
            }
        }
        out.println(ans);
        // out.println(Arrays.toString(Arrays.copyOf(bit, 20)));

        // int len = set.size();
        // int[] X_compress = new int[N];
        // Integer[] X_sort = set.toArray(new Integer[len]);
        // for (int i=0;i<N;i++) {
        //     X_compress[i] = Arrays.binarySearch(X_sort, X[i]);
        // }
        // System.out.println(Arrays.toString(X_compress));

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
