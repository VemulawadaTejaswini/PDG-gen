import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextLong();
        List<Long> aSum = new ArrayList<>();
        aSum.add((long) 0);
        List<Long> bSum = new ArrayList<>();
        bSum.add((long) 0);
        long tmp = 0;
        for (int i = 0; i < N; i++) {
            tmp += sc.nextLong();
            aSum.add(tmp);
        }
        tmp = 0;
        for (int i = 0; i < M; i++) {
            tmp += sc.nextLong();
            bSum.add(tmp);
        }
        int aInd = 0;
        int bInd = 0;
        long ans = 0;
        while (bSum.get(bInd) <= K) {
            bInd += 1;
            if (bInd == M) {
                break;
            }
        }

        while (true) {
            while (aInd <= N && aSum.get(aInd) + bSum.get(bInd) <= K) {
                aInd += 1;
            }
            if (aInd != 0) aInd -= 1;
            if (aSum.get(aInd) + bSum.get(bInd) <= K) {
                ans = Math.max(ans, aInd + bInd);
                if (aInd == N)
                    break;
                aInd += 1;
            }
            if (bInd == 0)
                break;
            while (aSum.get(aInd) + bSum.get(bInd) > K) {
                bInd -= 1;
                if (bInd == -1) {
                    bInd += 1;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
