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
        int K = in.nextInt();
        int[] P = new int[N];
        int sorted = 0;
        int cnt = 0;
        int before= -1;
        for (int i=0;i<N;i++) {
            P[i] = in.nextInt();
            if (P[i]>before) {
                cnt++;
                if (cnt>=4) sorted++;
            } else {
                cnt=1;
            }
            before = P[i];
        }

        for (int i=0;i<K;i++) {
            add(P[i]+1, 1);
        }

        int ans = N-K+1;
        for (int i=K;i<N;i++) {
            int flag = 0;
            if (get(0)!=P[i-K]+1) flag=1;
            add(P[i-K]+1, -1);
            add(P[i]+1, 1);
            if (get(K-1)!=P[i]+1) flag=1;
            if (flag==0) ans--;

            // out.println(flag);
        // for (int j=0;j<K;j++) {
        //     if (j==K-1) out.println(get(j));
        //     else out.print(get(j)+" ");
        // }
        }
        if (sorted>=2) out.println(ans-sorted+1);
        else out.println(ans);
        // out.println(sorted);

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
