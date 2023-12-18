import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static char[] s;
    static int[] mCum;
    static int[] cCum;
    static int[] cum;
    static int n;
    static int q;
    static int[] k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.next().toCharArray();
        q = sc.nextInt();
        k = new int[q];
        for (int i = 0; i < q; i++) {
            k[i] = sc.nextInt();
        }
        mCum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            mCum[i + 1] = mCum[i] + (s[i] == 'M' ? 1 : 0);
        }
        cCum = new int[n+1];
        for (int i = 0; i < n; i++) {
            cCum[i+1] = cCum[i] + (s[i] == 'C' ? 1 : 0);
        }
        cum = new int[n+1];
        for (int i = 0; i < n; i++) {
            cum[i+1] = cum[i] + (s[i] == 'C' ? mCum[i] : 0);
        }

        List<Integer> left = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s[i] == 'D') {
                left.add(i);
            }
        }
        for (int j = 0; j < k.length; j++) {
            int ret = 0;
            for(Integer i : left) {
                int right = Math.min(i+k[j], n);
                ret += cum[right] - cum[i] - (cCum[right] - cCum[i]) * mCum[i];
            }
            System.out.println(ret);
        }

    }
}
