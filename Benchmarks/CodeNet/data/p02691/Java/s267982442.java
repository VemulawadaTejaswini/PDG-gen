import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        Map<Long, Long> add = new TreeMap<>();
        long[] arr = new long[n+1];

        for (int i = 1; i <= n; i++) {
            long a = sc.nextLong();
            arr[i] = a;
            add.put(i+a, add.getOrDefault(i + a, 0L)+1);
        }

        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += add.getOrDefault(i-arr[i], 0L);
        }
        System.out.println(ans);
    }
}
