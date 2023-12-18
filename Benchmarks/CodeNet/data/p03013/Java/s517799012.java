import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    private static final BigInteger ZERO = BigInteger.ZERO;
    private static final BigInteger ONE = BigInteger.ONE;
    private static final BigInteger TWO = ONE.add(ONE);

    private static final Map<BigInteger, BigInteger> FIB_MAP = new HashMap<>();
    static {
        FIB_MAP.put(ZERO, ZERO);
        FIB_MAP.put(ONE, ONE);
    }

    public static BigInteger fibo(BigInteger num){
        if (num==BigInteger.valueOf(-1)) return BigInteger.ZERO;
        if (num==BigInteger.ZERO) return BigInteger.ONE;
        if (num==BigInteger.ONE) return BigInteger.ONE;
        return FIB_MAP.computeIfAbsent(num, key -> fibo(num.subtract(ONE)).add(fibo(num.subtract(TWO))));
//        if (num==-1){
//            return 0;
//        }
//        if (num==0) {
//            return 1;
//        }
//        if (num==1) {
//            return 1;
//        }
//        return fibo(num-1) + fibo(num-2);
    }

    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        BigInteger a[] = new BigInteger[m];

        IntStream.range(1, n).forEach(i -> fibo(BigInteger.valueOf(i)));

        BigInteger sum = BigInteger.valueOf(1);
        BigInteger x = BigInteger.valueOf(1000000007);

        for (int i=0; i<m; i++){
            a[i] = sc.nextBigInteger();
        }

        BigInteger multi[] = new BigInteger[m+1];

        multi[0] = fibo(a[0].subtract(ONE));
        multi[m] = fibo(BigInteger.valueOf(n).subtract(a[m-1]).subtract(ONE));

        for (int j=1; j<m; j++){
            multi[j] = fibo(a[j].subtract(a[j-1]).subtract(TWO));
        }

        for (int k=0; k<m+1; k++) {
            sum = sum.multiply(multi[k]);
        }

        System.out.println(sum.remainder(x));

    }
}



