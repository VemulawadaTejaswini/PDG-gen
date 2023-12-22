import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        int count = 0;

        if (isPrime(n)) {
            count = 1;

        } else if (n != 1) {
            int max = (int) (n / 2);
            for (int i = 2; i < max; i++) {
                if (n < i) {
                    break;
                }
                if (!isPrime(i) && !canDivPrime(i)) {
                    continue;
                }
                if (n % i == 0) {
                    n /= i;
                    count++;
                }
            }
        }

        int result = count;

        // 出力
        System.out.println(result);
    }

    public static boolean canDivPrime(int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(primeList(n));
        while (!pq.isEmpty()) {
            int num = pq.poll();
            if (n % num == 0) {
                return true;
            }
        }
        return false;
    }

    static List<Integer> primeList(int n) {
        List<Integer> list = new ArrayList<>();
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (!prime[i])
                continue;
            for (int j = 2; i * j <= n; j++) {
                prime[i * j] = false;
            }
        }
        for (int i = 0; i < prime.length; i++) {
            if (prime[i])
                list.add(i);
        }
        return list;
    }

    public static boolean isPrime(long num) {
        if (num == 2) {
            return true;
        } else if (num < 2 || num % 2 == 0) {
            return false;
        }
        double sqrtNum = Math.sqrt(num);
        for (long i = 3; i <= sqrtNum; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
