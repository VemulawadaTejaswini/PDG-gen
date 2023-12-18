import java.math.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] np = scanner.nextLine().split(" ", 2);
        long n = Long.parseLong(np[0]);
        long p = Long.parseLong(np[1]);
        long remP = p;

        long answer = 1;
        for (long i = 2; i <= p; i++) { // prime
            for (long j = 0; j < n; j++) {
                if (remP % i == 0) {
                    remP /= i;
                    if (j == n - 1) {
                        answer *= i;
                    }
                } else {
                    break;
                }
            }
            if (remP == 1) {
                break;
            }
        }
        System.out.println(answer);
    }
}
