import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();


        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            int l1Idx = i;
            for (int j = i + 1; j < n; j++) {
                int r1Idx = i;
                int l2Idx = j;
                int r2Idx = j;
                while (r2Idx < n && s.charAt(r1Idx) == s.charAt(r2Idx) && r1Idx < l2Idx) {
                    r1Idx++;
                    r2Idx++;
                }
                ans = Math.max(ans, r1Idx - l1Idx);
//                debug(l1Idx, r1Idx, l2Idx, r2Idx, ans);
            }
        }
        System.out.println(ans);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
