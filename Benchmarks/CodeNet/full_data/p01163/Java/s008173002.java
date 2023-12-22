import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    void run() {
        int MAX = 30001;
        boolean isPrime[] = new boolean[MAX];
        List<Integer> primes = new ArrayList<Integer>();
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i < MAX; i++) {
            if (isPrime[i]) {
                primes.add(i);
                for (int j = i + i; j < MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        while (true) {
            int T = sc.nextInt();
            if (T == 0)
                break;
            int ans = 0;
            for (int i = 0; i < primes.size(); i++) {
                int a = primes.get(i);
                if (a >= T)
                    break;
                for (int j = i; j < primes.size(); j++) {
                    int b = primes.get(j);
                    int c = T - a - b;
                    if (c < 0 || c < b)
                        break;
                    if (a + b > c && c > Math.abs(b - a))
                        if (isPrime[c]) {
                            ans++;
                        }
                }
            }
            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}