import java.util.*;

public class Main {

    private long N;
    private long K;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        K = sc.nextLong();
    }

    public void printAnswer() {
        long count = 0;
        for (long b = K + 1; b <= N; b++) {
            long wide = b - K;
            long pattern = N / b;
            long remainder = N % b;
            long ans = 0;
            if (remainder >= K) {
                ans = wide * pattern + remainder - K + 1;
            } else {
                ans = wide * pattern;
            }
            count += ans;
        }
        if (K == 0) {
            count -= N;
        }
        System.out.println(count);
    }

    public void run() {
        inputData();
        printAnswer();
    }

    public static void main(String[] args) {
        (new Main()).run();
    }

}
