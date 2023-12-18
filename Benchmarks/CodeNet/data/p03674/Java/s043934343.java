import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static long nPickK(long n, long k) {
        if (n < k) {
            return 0;
        }

        BigInteger bi = new BigInteger("1");
        for (int i = 0; i < k; i++) {
            BigInteger m = new BigInteger(String.valueOf(n - i));
        }
        for (int i = 2; i <= k; i++) {
            bi.divide(new BigInteger(String.valueOf(i)));
        }
        bi.mod(new BigInteger(String.valueOf(1000000007)));
        return Long.parseLong(bi.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> indexCache = new HashMap<>();
        int repeatingInt = -1;
        int repeatingIdx = -1;
        for (int i = 0; i < (n + 1); i++) {
            int readInt = sc.nextInt();
            if (indexCache.containsKey(readInt)) {
                repeatingInt = readInt;
                repeatingIdx = i;
            }
            else {
                indexCache.put(readInt, i);
            }
        }

        long numBeforeFirstAppearance = indexCache.get(repeatingInt);
        long numAfterSecondAppearance = n - repeatingIdx;
        long numOutsideRepeatBount = numBeforeFirstAppearance + numAfterSecondAppearance;
        for (int k = 1; k <= n + 1; k++) {
            if (k == 1) {
                System.out.println(n);
            }
            else if (k == (n + 1)) {
                System.out.println(1);
            }
            else {
                long allPossibleWithLengthK = nPickK(n + 1, k);
                long repeats = nPickK(numOutsideRepeatBount, k - 1);
                System.out.println(allPossibleWithLengthK - repeats);
            }
        }

    }
}
