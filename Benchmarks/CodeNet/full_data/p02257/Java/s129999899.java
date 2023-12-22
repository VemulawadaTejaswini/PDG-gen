import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());

        int count = 0;
        List<Integer> sieve = createSieve();
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(scanner.next());
            if (sieve.contains(x)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static List<Integer> createSieve() {
        List<Integer> sieve = new ArrayList<>();
        for (int i = 2; i <= 100000000; i++) {
            sieve.add(i);
        }

        for (int i = 0; ; i++) {
            if (i > sieve.size() - 1) {
                break;
            }
            int minp = sieve.get(i);
            for (int j = 2; ; j++) {
                int removed = minp * j;
                if (removed > sieve.get(sieve.size() - 1)) {
                    break;
                }
                sieve.remove((Integer) removed);
            }
        }

        return sieve;
    }
}