import java.util.*;
import java.io.*;

public class Main {

    static StreamTokenizer in;

    static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

    public static void main(String[] args) throws Exception {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = nextInt();
        int k = nextInt();

        int[] candies = new int[n];

        for (int i = 0; i < n; i++) {
            candies[i] = nextInt();
        }

        long[] dp = new long[k + 1];
        dp[0] = 1;
        SegTree segTree = new SegTree(0, k + 1);
        segTree.update(0, 1, 0);

        for (int i = 0; i < n; i++) {

            long[] orig = dp.clone();

            for (int j = 0; j <= k; j++) {
                dp[j] += segTree.rangeQuery(Math.max(0, j - candies[i]), j-1) % 1000000007;
            }

            for (int j = 0; j <= k; j++) {
                segTree.update(j, dp[j], orig[j]);
            }
        }

        out.println(dp[k]);

        out.close();
    }

    static class SegTree {
        int leftmost, rightmost;
        long total;
        SegTree lChild, rChild;
        public SegTree(int leftmost, int rightmost) {
            this.leftmost=leftmost;
            this.rightmost=rightmost;
            if (leftmost!=rightmost) {
                int mid=(leftmost+rightmost)/2;
                lChild = new SegTree(leftmost, mid);
                rChild = new SegTree(mid+1, rightmost);
            }
            total=0;
        }
        public void update(int index, long value, long origValue) {
            if (index<leftmost||index>rightmost) return;
            this.total -= origValue;
            this.total += value;
            if (leftmost==rightmost) return;
            if (index<=lChild.rightmost) lChild.update(index, value, origValue);
            else rChild.update(index, value, origValue);
        }

        public long rangeQuery(int l, int r) {
            if (l<=leftmost && r>=rightmost) return total;
            if (l>rightmost || r<leftmost) return 0;
            return lChild.rangeQuery(l, r) + rChild.rangeQuery(l, r);
        }

    }
}