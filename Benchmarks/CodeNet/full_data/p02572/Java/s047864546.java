import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        BigInteger[] A = new BigInteger[N];
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger tempSum;
        for (int i = 0; i < A.length; i++) {
            A[i] = s.nextBigInteger();
        }

        for (int i = 0; i < A.length; i++) {
            tempSum = BigInteger.valueOf(0);;
            for (int j = i + 1; j < A.length; j++) {
                tempSum = tempSum.add(A[j]);
            }
            sum = sum.add(tempSum.multiply(A[i]));
        }

        System.out.println(sum.remainder(BigInteger.valueOf(1000000007)));
    }
}