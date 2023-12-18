import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
        Arrays.sort(bs);
        
        Integer[] cs = new Integer[n];
        for (int i = 0; i < n; i++) {
            cs[i] = sc.nextInt();
        }
        Arrays.sort(cs);

        long ans = 0;
        for (int b : bs) {
            int ai = Arrays.binarySearch(as, b, (x, y) -> (x.compareTo(b) > 0) ? 1 : -1);
            ai = ~ai;

            int ci = Arrays.binarySearch(cs, b, (x, y) -> (x.compareTo(b) >= 0) ? 1 : -1);
            ci = ~ci;

            ans += (ai + 1) * (cs.length - (ci + 1));
        }

        System.out.println(ans);
    }
}
