import java.math.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] np = scanner.nextLine().split(" ", 2);
        long n = Long.parseLong(np[0]);
        long p = Long.parseLong(np[1]);
        long remP = p;

        if (n == 1) {
            System.out.println(p);
            return;
        }

        long answer = 1;

        for (long i = 2; i <= p; i++) { // prime
            long cnt = 0;
            while (remP % i == 0) {
                remP /= i;
                cnt++;
            }
            if (cnt >= n) {
                answer *= i;
            }
            if (remP == 1) {
                break;
            }
        }
        System.out.println(answer);
    }
}
