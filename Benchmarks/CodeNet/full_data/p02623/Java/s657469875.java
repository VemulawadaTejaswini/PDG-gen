import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextLong();

        long[] deskA = new long[N];
        long[] deskB = new long[M];

        for (int i = 0; i < N; i++) {
            deskA[i] = sc.nextLong();
        }

        for (int i = 0; i < M; i++) {
            deskB[i] = sc.nextLong();
        }

        sc.close();

        int bookCount = 0;
        int deskAidx = 0;
        int deskBidx = 0;
        long allTimes = 0;
        boolean isDeskAFinish = false;
        boolean isDeskBFinish = false;
        while (allTimes <= K) {
            long deskATimes = isDeskAFinish ? Long.MAX_VALUE : deskA[deskAidx];
            long deskBTimes = isDeskBFinish ? Long.MAX_VALUE : deskB[deskBidx];
            if (deskATimes < deskBTimes) {
                allTimes += deskATimes;
                deskAidx++;
                if (deskAidx > deskA.length - 1) {
                    isDeskAFinish = true;
                }
            } else {
                allTimes += deskBTimes;
                deskBidx++;
                if (deskBidx > deskB.length - 1) {
                    isDeskBFinish = true;
                }
            }
            if (allTimes <= K) {
                bookCount++;
            }
            if (isDeskAFinish && isDeskBFinish) {
                break;
            }
        }

        System.out.println(bookCount);
    }
}
