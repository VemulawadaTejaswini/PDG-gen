import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        TreeSet<Integer> allPrimes = primes(55555);
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            int x;
            do {
                x = allPrimes.pollFirst();
            } while (x % 5 != 1);
            result[i] = Integer.toString(x);
        }
        System.out.println(String.join(" ", result));
    }

    static TreeSet<Integer> primes(int max) {
        TreeSet<Integer> result = new TreeSet<>();
        TreeSet<Integer> seeds = new TreeSet<>();
        int limit = (int)Math.sqrt((double)max);
        result.add(2);
        for (int i = 3; i <= max; i+=2) {
            seeds.add(i);
        }
        while (seeds.size() > 0 && seeds.first() <= limit) {
            int seed = seeds.pollFirst();
            result.add(seed);
            for (int x = seed + seed; x <= max; x+=seed) {
                seeds.remove(x);
            }
        }
        if (seeds.size() > 0) {
            result.addAll(seeds);
        }
        return result;
    }
}
