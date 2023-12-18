import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // get a integer
        int a = sc.nextInt();
        // get two integers separated with half-width break
        int b = sc.nextInt();

        BigInteger[] numbers = new BigInteger[a];

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = sc.nextBigInteger();
        }
        sc.close();
        System.out.println(findMaximumValue(numbers, b));
    }

    static BigInteger findMaximumValue(BigInteger x[], int k) {
        BigInteger max = x[0];
        BigInteger check = BigInteger.valueOf(0);
        int start = 0;
        while (start < k) {
            for (int i = 0; i < x.length; i++) {
                check = check.add(BigInteger.valueOf((x[i].intValue() | start) & (~x[i].intValue() | ~start)));

            }
            start++;
            if (check.compareTo(max) > 0) {
                max = check;
            }
            check = BigInteger.ZERO;
        }
        return max;
    }

}
