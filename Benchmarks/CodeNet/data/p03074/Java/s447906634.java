import java.util.*;

public class Main {

    static int N;
    static int K;
    static String S;

    private static void read() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        S = sc.next();
    }

    public static void main(String[] args) {
        read();
        solve();
    }

    private static void solve() {
        List<Integer> ary = new ArrayList<>();
        int cur = '1';
        int curCnt = 0;
        for (char s : S.toCharArray()) {
            if (s == cur) {
                curCnt += 1;
            } else {
                ary.add(curCnt);
                cur = cur == '1' ? '0' : '1';
                curCnt = 1;
            }
        }
        if (curCnt != 0) {
            ary.add(curCnt);
        }
        if (ary.size() % 2 == 0) {
            ary.add(0);
        }

        List<Integer> cumSum = new ArrayList<>();
        cumSum.add(0);
        for (int i = 0; i < ary.size(); i += 1) {
            cumSum.add(cumSum.get(i) + ary.get(i));
        }

        int stride = 2 * K + 1;
        int best = 0;
        for (int left = 0; left < ary.size(); left += 2) {
            int right = Integer.min(left + stride, cumSum.size() - 1);
            best = Integer.max(best, cumSum.get(right) - cumSum.get(left));
        }

        System.out.println(best);
    }

}
