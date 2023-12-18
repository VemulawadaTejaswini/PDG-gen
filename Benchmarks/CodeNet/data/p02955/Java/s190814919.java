import java.util.*;

public class MaxGCD {
    static final TreeMap<Long, Integer> factorization = new TreeMap<>();
    static final List<Long> factors = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long ln = n;
        long k = in.nextInt();
        long[] array = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = in.nextLong();
            sum += array[i];
        }
        long sumTemp = sum
        for (long p = 2; p < 22361; p++) {
            int power;
            for (power = 0; sumTemp % p == 0; sumTemp /= p, power++);
            if (power > 0) {
                factorization.put(p, power);
            }
        }
        if (sumTemp != 1L) {
            factorization.put(sumTemp, 1);
        }
        generateFactors(1);
        factors.sort(Comparator.reverseOrder());
        for (long f : factors) {
            Long[] residues = new Long[n];
            long residueSum = 0;
            for (int i = 0; i < n; i++) {
                residues[i] = array[i] % f;
                residueSum += residues[i];
            }
            Arrays.sort(residues);
            long req = 0;
            long li = 0;
            for (int i = 0; li < ln - (residueSum / f); i++, li++) {
                req += residues[i];
            }
            if (k >= req) {
                System.out.println(f);
                return;
            }
        }
    }

    static void generateFactors(long curr) {
        if (factorization.isEmpty()) {
            factors.add(curr);
        } else {
            long p = factorization.firstKey();
            int power = factorization.remove(p);
            for (int e = 0; e <= power; e++, curr *= p) {
                generateFactors(curr);
            }
            factorization.put(p, power);
        }
    }
}
