import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        if (N <= 9) {
            System.out.println(N);
            return;
        }

        long curr = 9;
        int res = 9;
        while (curr < N) {
            curr = curr * 10 + 9;
            res += 9;
        }

        if (curr == N) {
            System.out.println(res);
            return;
        }

        int len = res / 9;
        long n = N;
        boolean isFull = true;
        while(len-- > 1) {
            if (n % 10 != 9) isFull = false;
            n /= 10;
        }

        System.out.println(isFull ? res - (9 - n) : res - (10 - n));
    }
}
