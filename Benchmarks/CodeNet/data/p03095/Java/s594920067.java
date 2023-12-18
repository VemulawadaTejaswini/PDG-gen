import java.util.*;

public class Main {
    static final long MOD = 1000000007;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        int[] sums = new int[26];
        for (char c : arr) {
            sums[c - 'a']++;
        }
        long total = 1;
        for (int i = 0; i < 26; i++) {
            total *= sums[i] + 1;
            total %= MOD;
        }
        total = (total - 1 + MOD) % MOD;
       System.out.println(total);
    }
}
