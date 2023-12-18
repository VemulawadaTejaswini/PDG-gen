import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Main {
    static int[] primes;
    static List<Integer> primeList;
    static {
        int length = (int) Math.sqrt(500000000) + 1;
        primes = new int[length];
        int max = (int) Math.sqrt(length) + 1;
        for (int i = 2; i < max; i++) {
            if (primes[i] == 1) {
                continue;
            }
            int cur = i * i;
            while (cur < length) {
                primes[cur] = 1;
                cur += i;
            }
        }

        primeList = new ArrayList<>();
        for (int i = 2; i < length; i++) {
            if (primes[i] == 0) {
                primeList.add(i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }

        int sum = 0;
        for (int a : A) {
            sum += a;
        }

        SortedSet<Integer> factors = new TreeSet<>(Comparator.reverseOrder());
        List<Integer> tmpPrimes = new ArrayList<>(primeList);
        while (sum > 1 && tmpPrimes.size() > 0) {
            if (sum % tmpPrimes.get(0) == 0) {
                sum /= tmpPrimes.get(0);
                factors.addAll(factors.stream().map(i -> i*tmpPrimes.get(0)).collect(Collectors.toList()));
                factors.add(tmpPrimes.get(0));
            } else {
                tmpPrimes.remove(0);
            }
        }
        factors.add(sum);
        for (int i : factors) {
            if (helper(i, K, A)) {
                System.out.println(i);
            }
        }

        System.out.println(1);
    }

    private static boolean helper(int i, int k, int[] A) {
        int max = 0, sum = 0;
        for (int a : A) {
            int tmp = a % i;
            max = Math.max(max, tmp);
            sum += tmp;
        }

        return sum - max <= k;
    }
}