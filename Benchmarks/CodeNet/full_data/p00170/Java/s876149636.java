import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean used[];
    static int nums[];
    static String fs[];
    static int ws[];
    static int ss[];
    static double g;
    static int[] ans;
    static int total;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            nums = new int[n];
            used = new boolean[n];
            fs = new String[n];
            ws = new int[n];
            ss = new int[n];
            ans = new int[n];
            total = 0;
            for (int i = 0; i < n; i++) {
                String f = sc.next();
                int w = sc.nextInt();
                int s = sc.nextInt();
                fs[i] = f;
                ws[i] = w;
                ss[i] = s;
                total += w;
            }
            g = Double.MAX_VALUE;
            permutation(0, n, 0);
            for (int i = n - 1; i >= 0; i--) {
                System.out.println(fs[ans[i]]);
            }
        }
    }

    public static void permutation(int pos, int n, int sum) {
        if (pos == n) {
            int a = 0;
            for (int i = 0; i < n; i++) {
                a += (n - i) * ws[nums[i]];
            }
            double G = 1.0 * a / total;
            if (G < g) {
                for (int i = 0; i < n; i++) {
                    ans[i] = nums[i];
                }
                g = G;
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (used[i])
                continue;
            if (ss[i] < sum)
                continue;
            nums[pos] = i;
            used[i] = true;
            permutation(pos + 1, n, sum + ws[i]);
            used[i] = false;
        }
        return;
    }
}