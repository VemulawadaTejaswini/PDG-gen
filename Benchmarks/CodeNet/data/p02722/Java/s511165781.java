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
        Set<Long> divisors = new HashSet<>();
        for (long i = 1; i * i <= N-1; i++) {
            if ((N - 1) % i != 0) {
                continue;
            }
            if (i != 1) {
                divisors.add(i);
            }
            divisors.add((N - 1) / i);
        }
        List<Long> list = new ArrayList<>();
        for (long i = 1; i * i <= N; i++) {
            if (N % i != 0) {
                continue;
            }
            if (i != 1) {
                list.add(i);
            }
            list.add(N / i);
        }
        for (long i : list) {
            long target = N;
            while (target % i == 0) {
                target /= i;
            }
            target -= ((target - i) / i) * i;
            while (i <= target) {
                target -= i;
            }
            if (target == 1) {
                divisors.add(i);
            }
        }
        System.out.println(divisors.size());
    }
}
