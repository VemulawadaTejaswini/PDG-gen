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
        for (long i = 1; i * i <= N - 1; i++) {
            if ((N - 1) % i != 0) {
                continue;
            }
            divisors.add(i);
            divisors.add((N - 1) / i);
        }
        divisors.remove(1L);
        Set<Long> set = new HashSet<>();
        for (long i = 1; i * i <= N; i++) {
            if (N % i != 0) {
                continue;
            }
            set.add(i);
            set.add(N / i);
        }
        set.remove(1L);
        for (long i : set) {
            long target = N;
            while (target % i == 0) {
                target /= i;
            }
            if ((target - 1) % i == 0) {
                divisors.add(i);
            }
        }
        System.out.println(divisors.size());
    }
}
