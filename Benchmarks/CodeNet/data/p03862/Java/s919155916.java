import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long x = sc.nextLong();
        long[] values = new long[N+1];

        for (int i = 0; i < N; i++) {
            values[i] = sc.nextLong();
        }

        long ans = 0;
        for (int i = 1; i < N; i += 2) {
            long max = Math.max(values[i - 1], values[i + 1]);
            if (max + values[i] > x) {
                long diff = max + values[i] - x;
                ans += diff;
                values[i] = values[i] - diff;
            }
        }
        System.out.println(ans);
    }
}