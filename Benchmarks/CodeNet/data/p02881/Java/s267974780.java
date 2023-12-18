import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long minSum = Long.MAX_VALUE;
        boolean isOdd = n % 2 == 1;

        if (isOdd) {
            for (long i = 1; i * i <= n; i += 2) {
                if (n % i == 0) {
                    long sum = n / i + i;
                    if (minSum > sum) {
                        minSum = sum;
                    }
                }
            }
        } else {
            for (long i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    long sum = n / i + i;
                    if (minSum > sum) {
                        minSum = sum;
                    }
                }
            }
        }

        System.out.println(minSum - 2);
    }
}
