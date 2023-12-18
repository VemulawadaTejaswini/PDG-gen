import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        String s = scanner.next();
        Zalgolithm z = new Zalgolithm();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            String sub = s.substring(i);
            z.calcZarray(sub);
            for (int n: z.zArr) {
                max = Math.max(max, n);
            }
        }
        System.out.println(max);
    }
}


// Tested on AOJ
class Zalgolithm {
    public int[] zArr;

    void calcZarray(String s) {
        int n = s.length();
        zArr = new int[n];

        // range of z-box
        int l = 0, r = 0;

        // zArr[0] is meaningless to calculate
        for (int curr = 1; curr < n; curr++) {
            if (curr > r) {
                // curr is out of z-box, calc zArr[i] naively
                l = r = curr;
                // ababc -> ababc -> ababc
                // * *   ->  * *  ->   * *
                while (r < n && r - l < l && s.charAt(r - l) == s.charAt(r)) r++;
                zArr[curr] = r - l;
                r--;
            } else {
                // i is in z-box
                // Since nums from beginning and nums in z-box have the same sequence, we copy these zArr values.
                // str:  abc[abc]x
                // zArr: 000[300]0
                int correspondingCurr = curr - l;
                int remainingInZbox = r - curr;
                if (correspondingCurr + zArr[correspondingCurr] <= l) {
                    // copiable since we have enough elements in zbox
                    zArr[curr] = zArr[correspondingCurr];
                } else {
                    // not copiable since we don't have enough elements in zbox
                    l = curr;
                    while (r < n && r - l < l && s.charAt(r - l) == s.charAt(r)) r++;
                    zArr[curr] = r - l;
                    r--;
                }
            }
        }
    }

}
