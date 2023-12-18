import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        long K = in.nextLong();

        if (K == 1) {
            System.out.println(K);
            return;
        }

        if (N % K == 0) {
            System.out.println(0);
            return;
        }

        if (N == 0 || K % N == 0) {
            System.out.println(N);
            return;
        }

        long slow = absoluteDiff(N, K);
        long fast = absoluteDiff(absoluteDiff(N, K), K);
        long min = N;

        while (slow != fast) {
            if (slow % K == 0 || fast % K == 0) {
                System.out.println(0);
                return;
            }
            if (K % slow == 0) {
                System.out.println(N);
                return;
            }
            if (K % fast == 0) {
                System.out.println(N);
                return;
            }

            min = Math.min(Math.min(min, slow), fast);
            slow = absoluteDiff(slow, K);
            fast = absoluteDiff(absoluteDiff(fast, K), K);
        }

        System.out.println(Math.min(min, slow));

    }

    public static long absoluteDiff(long a, long b) {
        return Math.abs(a - b);
    }

}