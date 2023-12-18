import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long k = sc.nextLong();

        long[] numbers = new long[(int)k];

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = sc.nextLong();
        }
        sc.close();
        System.out.println(findMaximumValue(numbers, k));
    }

    static long findMaximumValue(long x[], long k) {
        long max = x[0];
        long check = 0;
        int start = 0;
        while (start < k) {
            for (int i = 0; i < x.length; i++) {
                check = check + ((x[i] | start) & (~x[i] | ~start));

            }
            start++;
            if (check > max) {
                max = check;
            }
            check = 0;
        }
        return max;
    }

}
