import java.util.*;
import java.util.stream.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(), s = in.nextLong();

        for(long b = 2; b <= Math.sqrt(n); b++) {
            if(digitSum(n, b) == s) {
                System.out.println(b);
                return;
            }
        }
        for(long p = 1; p < Math.sqrt(n); p++) {
            if((n - s) % p == 0) {
                long b = (n - s) / p + 1;
                if(digitSum(n, b) == s) {
                    System.out.println(b);
                    return;
                }
            }
        }
        System.out.println(-1);
    }

    public static long digitSum(long num, long b) {
        long sum = 0;
        while(0 < num) {
            sum += num % b;
            num /= b;
        }
        return sum;
    }
}
