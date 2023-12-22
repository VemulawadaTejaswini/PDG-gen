import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long start = 0;
        List<Long> ans = new ArrayList<>();
        while (true) {
            long b = sc.nextLong();
            if (start == 0)
                start = System.nanoTime();
            if (b == 0)
                break;

            PrimeFact pf = new PrimeFact(2*b);

            long a = 0, n = 0;
            int max = (int) Math.ceil(Math.sqrt(2*b));
            List<Long> divisors = pf.divisors();
            divisors.sort((Comparator.comparingLong(o -> o)));
            for (long d : divisors) {
                if (d > max)
                    break;
                double temp = (double) (2*b/d - d + 1) / 2;
                if (temp == Math.floor(temp) && temp > 0 && d > n) {
                    n = d;
                    a = (long) temp;
                }
            }

            ans.add(a);
            ans.add(n);
            System.out.println(a + " " + n);
        }

    }


    public static class PrimeFact {
        private final Long orig;
        private LinkedHashMap<Long, Integer> factorization;

        public PrimeFact(long num) {
            orig = num;
            factorization = factorize(num);
        }

        public PrimeFact(int num) {
            orig = (long) num;
            factorization = factorize(num);
        }

        public List<Long> divisors() {
            return getDivisors(this.factorization);
        }
    }

    private static LinkedHashMap<Long, Integer> factorize(long num) {

        LinkedHashMap<Long, Integer> fact;

        if (num == 1L) return new LinkedHashMap<>();

        long sqrt = (long) Math.floor(Math.sqrt(num));

        for (long p : getPrimes(sqrt)) {
            if (num % p == 0) {
                fact = factorize(num/p);
                if (fact.containsKey(p)) fact.put(p, fact.get(p) + 1);
                else fact.put(p, 1);
                return fact;
            }
        }

        fact = new LinkedHashMap<>();
        fact.put(num, 1);
        return fact;
    }

    private static LinkedList<Long> primes;

    static {
        primes = new LinkedList<>();
        primes.add(2L);
    }

    public static List<Long> getPrimes(long min) {

        if (primes.getLast() < min)
            genPrime(min);

        int index = 0;
        for (long p : primes) {
            if (p > min) break;
            index++;
        }

        return primes.subList(0, index);
    }

    private static void genPrime(long min) {
        for (long biggestKnown = primes.getLast() + 1; biggestKnown <= min; biggestKnown++) {
            if (isPrime(biggestKnown)) primes.add(biggestKnown);
        }
    }

    private static boolean isPrime(long num) {
        int sqrt = (int) Math.floor(Math.sqrt(num));

        for (long p : primes) {
            if (p > sqrt) break;
            if (num % p == 0) return false;
        }

        return true;
    }

    // ------------------------
    // Get Divisors List
    // ------------------------

    public static List<Long> getDivisors(HashMap<Long, Integer> fact) {
        List<Long> ret = new ArrayList<>();
        if (fact.isEmpty()) {
            ret.add(1L);
            return ret;
        }

        for (Map.Entry<Long, Integer> e : fact.entrySet()) {
            HashMap<Long, Integer> copy = clone(fact);
            copy.remove(e.getKey());
            List<Long> divs = getDivisors(copy);
            for (long div : divs) {
                for (int i = 0; i <= e.getValue(); i++) {
                    ret.add(div * (long) Math.pow(e.getKey(), i));
                }
            }
            break;
        }
        return ret;
    }

    private static HashMap<Long, Integer> clone(HashMap<Long, Integer> h) {
        HashMap<Long, Integer> ret = new HashMap<>();
        for (Map.Entry<Long, Integer> e : h.entrySet()) {
            ret.put(e.getKey(), e.getValue());
        }
        return ret;
    }
}
