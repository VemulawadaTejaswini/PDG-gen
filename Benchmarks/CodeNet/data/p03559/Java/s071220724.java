import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        Integer[] as = new Integer[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
        }
        Arrays.sort(as);

        Integer[] bs = new Integer[n];
        for (int i = 0; i < n; i++) {
            bs[i] = sc.nextInt();
        }
        // Arrays.sort(bs);

        Integer[] cs = new Integer[n];
        for (int i = 0; i < n; i++) {
            cs[i] = sc.nextInt();
        }
        Arrays.sort(cs, Collections.reverseOrder());

        long ans = 0;
        for (Integer b : bs) {
            // long ai = Arrays.binarySearch(as, b, (x, y) -> (x.compareTo(y) > 0) ? 1 : -1);
            // ai= ~ai;
            int ai = 0;
            for (Integer a : as) {
                if (a >= b) {
                    break;
                }

                ai++;
            }

            // long ci = Arrays.binarySearch(cs, b, (x, y) -> (x.compareTo(y) >= 0) ? 1 : -1);
            // ci = ~ci;
            int ci = 0;
            for (Integer c : cs) {
                if (c <= b) {
                    break;
                }

                ci++;
            }

            ans += ai * ci;
        }

        System.out.println(ans);
    }
}
