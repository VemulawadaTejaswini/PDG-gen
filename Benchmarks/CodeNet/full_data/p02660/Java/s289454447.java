import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        int count = 0;
        PrimeExpStream peStream = new PrimeExpStream();
        while (true) {
            if (PrimeExpStream.isPrime(n)) {
                count++;
                break;
            }
            long z = peStream.next();
            if (n < z) {
                break;
            }
            if (n % z == 0) {
                n = n / z;
                count++;
            } else {
                peStream.except(z);
            }
        }
        System.out.println(count);
    }

    private static class PrimeExpStream {
        private long nextPrime;
        private List<PrimeExp> primes;
        private List<Long> allPrimes;
        public PrimeExpStream() {
            nextPrime = 2;
            primes = new ArrayList<>();
            allPrimes = new ArrayList<>();
        }
        public long next() {
            PrimeExp min = primes.stream()
                    .min(Comparator.comparingLong(PrimeExp::getNextValue))
                    .orElse(new PrimeExp(13)); // 2が登録されるはずなので、初回のみ。
            if (nextPrime < min.getNextValue()) {
                primes.add(new PrimeExp(nextPrime));
                allPrimes.add(nextPrime);
                long ret = nextPrime;
                calcNextPrime();
                return ret;
            }
            min.next();
            return min.getValue();
        }
        private void calcNextPrime() {
            long p = nextPrime + 1;
            while (!isPrime(p)) {
                p++;
            }
            nextPrime = p;
        }
        public static boolean isPrime(long x) {
            if (x < 2) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }
        private void except(long z) {
            Optional<PrimeExp> target = primes.stream()
                    .filter(pe -> pe.hasPrime(z))
                    .findFirst();
            if (target.isPresent()) {
                primes.remove(target.get());
            }
        }
        private class PrimeExp {
            private int e;
            private long p;
            public PrimeExp(long p) {
                this.p = p;
                e = 1;
            }
            public void next() {
                e = e+1;
            }
            public long getValue() {
                return (long)Math.pow(p, e);
            }
            public long getNextValue() {
                return (long)Math.pow(p, e+1);
            }
            public boolean hasPrime(long p) {
                return this.p == p;
            }
        }
    }
}