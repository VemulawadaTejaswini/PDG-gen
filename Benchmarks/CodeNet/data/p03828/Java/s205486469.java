import java.math.BigDecimal;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int X = sc.nextInt();

        HashMap<Integer, Long> primeCount = new HashMap<>();

        for (int i = 2; i <= X; i++) {
            int value = i;
            for (int j = 2; j <= i; j++) {
                while (value % j == 0) {
                    primeCount.put(j, primeCount.containsKey(j) ? primeCount.get(j) + 1 : 1);
                    value = value / j;
                }
            }
        }


        long ans = 1;
        for (Map.Entry<Integer, Long> entry: primeCount.entrySet()) {
            ans *= entry.getValue() + 1;
            ans = ans % 1000000007l;
        }
        System.out.println(ans);
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) return false;
        }
        return true;
    }
}