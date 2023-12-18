import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long N = scan.nextLong();
        List<Long> divisors = divisors(N);
        long answer = Long.MAX_VALUE;
        for (long x : divisors) {
            long y = N / x;
            answer = Math.min(answer, x - 1 + y - 1);
        }
        System.out.println(answer);
    }
    private List<Long> divisors(long N) {
        List<Long> divisors = new ArrayList<>();
        for (long i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                divisors.add(i);
                if (i * i != N) {
                    divisors.add(N/i);
                }
            }
        }
        divisors.sort(Comparator.naturalOrder());
        return divisors;
    }
}
