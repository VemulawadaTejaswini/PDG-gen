import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String S = scan.next();
        char[] d = S.toCharArray();
        SegmentTree[] segs = new SegmentTree[26];
        for (int i = 0; i < 26; i++) {
            segs[i] = new SegmentTree(d.length);
        }
        for (int i = 0; i < d.length; i++) {
            segs[(int) d[i]-'a'].update(i, 1);
        }
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            int type = scan.nextInt();
            if (type == 1) {
                int index = scan.nextInt()-1;
                char old_c = d[index];
                char new_c = scan.next().toCharArray()[0];
                if (old_c == new_c) {
                    continue;
                }
                segs[(int)old_c-'a'].update(index, 0);
                segs[(int)new_c-'a'].update(index, 1);
                d[index] = new_c;
                continue;
            }
            int l = scan.nextInt()-1;
            int r = scan.nextInt();
            int ans = 0;
            for (int j = 0; j < 26; j++) {
                ans += segs[j].query(l, r);
            }
            System.out.println(ans);
        }
    }
    class SegmentTree {
        int size;
        int[] data;
        SegmentTree(int N) {
            int size = 1;
            while (size < N) {
                size *= 2;
            }
            int[] data = new int[size * 2];
            Arrays.fill(data, 0);
            this.size = size;
            this.data = data;
        }
        void update(int k, int a) {
            k += this.size - 1;
            this.data[k] = a;
            while (0 < k) {
                k = (k - 1) / 2;
                this.data[k] = Math.max(data[k * 2 + 1], data[k * 2 + 2]);
            }
        }
        int query(int a, int b) {
            return query(a, b, 0, 0, this.size);
        }
        int query(int a, int b, int k, int l, int r) {
            if (r <= a || b <= l) {
                return 0;
            }
            if (a <= l && r <= b) {
                return this.data[k];
            }
            int value_left = query(a, b, k * 2 + 1, l, (l+r)/2);
            int value_right = query(a, b, k * 2 + 2, (l+r)/2, r);
            return Math.max(value_left, value_right);
        }
    }
}
