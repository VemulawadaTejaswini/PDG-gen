import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int MOD = (int) Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
//            while (true)// MAKE SURE TO REMOVE THIS
                solve(in);
        }
    }

    private static final List<Integer> furui(int N) {
        boolean[] furui = new boolean[N + 1];
        for (int i = 2; i < N + 1; i++) {
            furui[i] = true;
        }
        List<Integer> ret = new ArrayList<>(N);
        for (int i = 2; i <= N; i++) {
            if (furui[i]) {
                ret.add(i);
                for (int j = i + i; j <= N; j += i) {
                    furui[j] = false;
                }
            }
        }
        return ret;
    }

    private static void solve(Scanner in) {
        int N = in.nextInt();
        List<Integer> ps = furui(N);
        long[] hist = new long[N + 1];
        for (int p : ps) {
            int h = 0;
            int n = N;
            while (n / p > 0) {
                n /= p;
                h += n;
            }
            hist[p] = h;
        }
        long count = 1;
        for (int i = 0; i < N + 1; i++) {
            count *= (hist[i] + 1);
            count %= MOD;
        }
        System.out.println(count);
    }
}