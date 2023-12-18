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
        /*for (int a = Math.max(1, K); a <= N; a++) {
            for (int b = K + 1; b <= N; b++) {
                if (a % b >= K) {
                    count++;
                }
            }
        }*/
        for (long b = K + 1; b <= N; b++) {
            long wide = b - K;
            long pattern = N / b;
            long ans = wide * pattern;
            for (long a = b * pattern + 1; a <= N; a++) {
                if (a % b >= K) {
                    ans++;
                }
            }
            count += ans;
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
