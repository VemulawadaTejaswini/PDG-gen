import java.util.*;

public class Main {
    static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int r = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i + 1;
            }
            long[] kaijos = new long[n];
            kaijos[0] = 1;
            kaijos[1] = 1;
            for (int i = 2; i < n; i++) {
                kaijos[i] = (i * kaijos[i - 1]) % MOD;
            }
            for (int i = 0; i < r; i++) {
                int s = sc.nextInt() - 1;
                int t = sc.nextInt() - 1;
                int tmp = arr[s];
                arr[s] = arr[t];
                arr[t] = tmp;
            }
            long total = 0;
            ArrayList<Integer> used = new ArrayList<>();
            used.add(0);
            used.add(Integer.MAX_VALUE);
            for (int i = 0; i < n; i++) {
                int x = arr[i];
                int left = 0;
                int right = used.size() - 1;
                while (right - left > 1) {
                    int m = (left + right) / 2;
                    if (used.get(m) < x) {
                        left = m;
                    } else {
                        right = m;
                    }
                }
                used.add(right, x);
                total += (kaijos[n - i - 1] * (x - right)) % MOD;
                total %= MOD;
            }
            sb.append(total).append("\n");
        }
        System.out.print(sb);
    }
}

