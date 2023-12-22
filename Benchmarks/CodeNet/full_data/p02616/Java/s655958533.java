
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int mod = 1000000000 + 7;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int k = Integer.parseInt(scan.next());
        List<Integer> plus = new ArrayList<Integer>();
        List<Integer> minus = new ArrayList<Integer>();
        List<Integer> zero = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scan.next());
            if (a > 0) {
                plus.add(a);
            } else if (a < 0) {
                minus.add(a);
            } else {
                zero.add(a);
            }
        }
        scan.close();

        if (n == k) {
            long ans = 1;
            for (int a : plus) {
                ans *= a;
                ans %= mod;
            }
            for (int a : minus) {
                ans *= a;
                while (ans < 0) {
                    ans += mod;
                }
                ans %= mod;
            }
            for (int a : zero) {
                ans *= a;
            }
            System.out.println(ans);
            return;
        }

        if (plus.size() == 0 && k % 2 == 1) {
            if (zero.size() != 0) {
                System.out.println(0);
                return;
            }
            Collections.sort(minus, Collections.reverseOrder());
            long ans = 1;
            for (int i = 0; i < k; i++) {
                ans *= minus.get(i);
                while (ans < 0) {
                    ans += mod;
                }
                ans %= mod;
            }
            System.out.println(ans);
            return;
        }

        if (plus.size() + minus.size() < k) {
            System.out.println(0);
            return;
        }

        Collections.sort(plus, Collections.reverseOrder());
        Collections.sort(minus, Collections.reverseOrder());
        int minusCount;
        int plusCount;
        if (k <= minus.size()) {
            minusCount = k;
        } else {
            minusCount = minus.size();
        }
        if (minusCount % 2 != 0) {
            minusCount -= 1;
        }
        plusCount = k - minusCount;

        while (minusCount >= 2 && plusCount <= plus.size() - 2 &&
                minus.get(minusCount - 1) * minus.get(minusCount - 2) < plus.get(plusCount) * plus.get(plusCount + 1)) {
            minusCount -= 2;
            plusCount += 2;
        }

        long ans = 1;
        for (int i = 0; i < plusCount; i++) {
            ans *= plus.get(i);
            ans %= mod;
        }
        for (int i = 0; i < minusCount; i++) {
            ans *= minus.get(i);
            while (ans < 0) {
                ans += mod;
            }
            ans %= mod;
        }

        System.out.println(ans);
    }
}
