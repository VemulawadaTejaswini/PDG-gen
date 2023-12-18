import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long x = sc.nextLong();
        long[] values = new long[N+2];

        for (int i = 0; i < N; i++) {
            values[i + 1] = sc.nextLong();
        }

        long ans = 0;
        for (int i = 0; i < N + 1; i++) {
            if (values[i+1] + values[i] > x) {
                long diff = values[i+1] + values[i] - x;
                ans += diff;
                values[i+1] = values[i+1] - diff;
            }
        }
        System.out.println(ans);
    }
}