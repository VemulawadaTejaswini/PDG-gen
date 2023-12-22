import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    static final long MOD = 1_000_000_007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Long[] a = new Long[n];

        boolean allNegative = true;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
            if (a[i] >= 0) {
                allNegative = false;;
            }
        }

        Arrays.sort(a, Comparator.comparingLong(v -> Math.abs(v)));

        Set<Pair> positives = new TreeSet<>();
        boolean[] selected = new boolean[n];
        Arrays.fill(selected, false);

        for (int i = n - 1; i >= 0; i--) {
            if (selected[i]) continue;
            for (int j = i - 1; j >= 0; j--) {
                if (a[i] * a[j] >= 0) {
                    Pair p = new Pair();
                    p.i = i;
                    p.j = j;
                    p.value = a[i] * a[j];
                    positives.add(p);
                    i = j;
                    selected[i] = true;
                    selected[j] = true;
                    break;                    
                }
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (selected[i]) continue;
            for (int j = i - 1; j >= 0; j--) {
                if (a[i] * a[j] >= 0) {
                    i = j;
                    selected[i] = true;
                    selected[j] = true;
                    break;                    
                }
            }
        }

        if (allNegative && k % 2 == 1) {
            long ans = 1;
            for (int i = 0; i < k; i++) {
                ans = modmul(ans, a[i], MOD);
            }

            System.out.println(ans > 0 ? ans : ans + MOD);
            return;
        }

        int count = 0;
        long ans = 1;
        boolean[] used = new boolean[n];
        Arrays.fill(used, false);
        for (Pair p : positives) {
            if (count >= k / 2) {
                break;
            }

            ans = modmul(ans, p.value, MOD);
            used[p.i] = true;
            used[p.j] = true;

            count++;
        }

        if (k % 2 == 1) {
            for (int i = n - 1; i >= 0; i--) {
                if (used[i] == false && a[i] >= 0) {
                    ans = modmul(ans, a[i], MOD);
                }
            }
        }

        System.out.println(ans >= 0 ? ans : ans + MOD);
    }

    static long modmul(long a, long b, long mod) {
        long r = ((a % mod) * (b % mod)) % mod;
        return r >= 0 ? r : r + mod;
    }
}

class Pair implements Comparable<Pair> {
    int i;
    int j;
    long value;

    @Override
    public int compareTo(Pair o) {
        return this.value - o.value < 0 ? 1 : -1;
    }
}