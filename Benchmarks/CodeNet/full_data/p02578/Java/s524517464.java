import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigInteger[] nums = new BigInteger[N];


        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextBigInteger();
        }

        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i < N; i++) {
            if (nums[i-1].compareTo(nums[i]) > 0) {
                BigInteger b = nums[i - 1].subtract(nums[i]);

                sum = sum.add(b);
                nums[i] =nums[i].add(b);
            }
        }

        System.out.println(sum);

    }
}