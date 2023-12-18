import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n = 100000;

        int lim = 1000000000;

        Random r = new Random();

        for (int i=0; i < n; i++) {
            System.out.print(r.nextInt(lim) + " ");
        }
    }

    public static HashMap<Integer, Integer> fact(int a) {
        BigInteger n = BigInteger.valueOf(a);
        HashMap<Integer, Integer> primeFactors = new HashMap<>();
        BigInteger primeFactor = BigInteger.ZERO;

        for (BigInteger i = new BigInteger("2"); i.compareTo(n.divide(i)) <= 0; ) {
            if (n.mod(i).longValue() == 0) {
                primeFactor = i;
                primeFactors = add(primeFactors, primeFactor.intValue());
                n = n.divide(i);
            } else {
                i = i.add(BigInteger.ONE);
            }
        }

        if (primeFactor.compareTo(n) < 0) {
            primeFactors = add(primeFactors, n.intValue());
        } else {
            primeFactors = add(primeFactors, primeFactor.intValue());
        }

        return primeFactors;
    }

    private static HashMap<Integer, Integer> add(HashMap<Integer, Integer> h, int n) {
        if (h.containsKey(n))
            h.put(n, h.get(n) + 1);
        else
            h.put(n, 1);
        return h;
    }
}