import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());
        TreeMap<Integer, Integer> primes = new Prime().factorize(N);
        StringBuilder sb = new StringBuilder();
        sb.append(N);
        sb.append(": ");
        for (Map.Entry<Integer, Integer> e : primes.entrySet()) {
            for (int i = 0; i < e.getValue(); i++) {
                sb.append(e.getKey());
                sb.append(' ');
            }
        }
        System.out.println(sb.toString().trim());
    }

}

class Prime {
    public boolean isPrime(int n) {
        return getDivisors(n).size() == 2;
    }

    public List<Integer> getDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }

    public TreeMap<Integer, Integer> factorize(int n) {
        TreeMap<Integer, Integer> primes = new TreeMap<>();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                primes.put(i, primes.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        if (n != 1) {
            primes.put(n, 1);
        }
        return primes;
    }
}



