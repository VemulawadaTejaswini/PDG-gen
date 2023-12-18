import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long a = input.nextLong();
        long b = input.nextLong();
        long c = input.nextLong();
        long k = input.nextLong();

        if (k == 0){
            System.out.println(-1);
            return;
        }

        BigInteger kValue  = BigInteger.valueOf(k);
        BigInteger kValuePluseOne  = BigInteger.valueOf(k + 1);

        BigInteger multiplication = kValue.multiply(kValuePluseOne).divide( BigInteger.valueOf(2));

        long sumA = b + c;

        long sumB = a + c;

        BigInteger finalSumA = BigInteger.valueOf(sumA).multiply(multiplication);
        BigInteger finalSumB = BigInteger.valueOf(sumB).multiply(multiplication);

        BigInteger finalS = finalSumA.subtract(finalSumB).abs();



        if (finalS.compareTo(BigInteger.valueOf(1000000000000000000L))  > 0){
            System.out.print("Unfair");
        }else{
            System.out.println(finalS);
        }

    }
}
