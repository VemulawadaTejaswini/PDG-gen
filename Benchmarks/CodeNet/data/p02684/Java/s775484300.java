import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long k = Long.parseLong(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next()) - 1;
        }
        Set<Integer> set = new HashSet<>();
        int idx = 0;
        long tempNum = 0;
        long tempNum2 = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            int idx2 = a[idx];
            tempNum = i + 1;
            if (set.contains(idx2)) {
                tempNum--;
                start = idx;
                int idx3 = idx2;
                for (int j = 0; j < n; j++) {
                    idx3 = a[idx3];
                    tempNum2++;
                    if (idx3 == idx2) {
                        break;
                    }
                }
                break;
            } else {
                set.add(idx2);
                idx = idx2;
            }
        }
        k -= tempNum;
        long mod;
        if (tempNum2 != 0) {
            mod = k % tempNum2;
        } else {
            mod = k % (long)n;
        }
        int ans = start;
        for (long i = 0; i < mod; i++) {
            ans = a[ans];
        }
        System.out.println(ans + 1);
    }
}