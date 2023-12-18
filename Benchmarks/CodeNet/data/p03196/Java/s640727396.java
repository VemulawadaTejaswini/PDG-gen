import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long N = scan.nextLong();
        long P = scan.nextLong();
        if (N == 1) {
            System.out.println(P);
            return;
        }
        boolean[] primes = new boolean[1000001];
        primes[0] = false;
        primes[1] = false;
        for (long i = 2; i * i <= P; i++) {
            for (long j = 2; i * j <= P && i * j <= 1000000; j++) {
                int index = (int) i * (int) j;
                primes[index] = true;
            }
        }
        long answer = 1;
        for (long i = 2; i * i <= P && i * i <= 1000000; i++) {
            int index = (int) i;
            if (primes[index]) {
                continue;
            }
            long temp = P;
            long count = 0;
            while (0 < temp) {
                if (temp % i != 0) {
                    break;
                }
                temp /= i;
                count += 1;
            }
            if (count < N) {
                continue;
            }
            long num = count / N;
            answer *= num * i;
        }
        System.out.println(answer);
    }
}
