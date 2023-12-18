import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] aryA = new long[N+1];
        long[] aryB = new long[N];
        for (int i = 0; i < N+1; i++) {
            long a = Long.parseLong(sc.next());
            aryA[i] = a;
        }
        for (int i = 0; i < N; i++) {
            long a = Long.parseLong(sc.next());
            aryB[i] = a;
        }
        long cnt = 0L;
        boolean isDefeated = false;
        for (int i = 0; i < N; i++) {
            long enemyCnt = 0L;
            if (isDefeated) {
                enemyCnt = aryA[i+1] - aryB[i];
            } else {
                enemyCnt = (aryA[i] + aryA[i+1]) - aryB[i];
            }
            if (enemyCnt < 0) {
                if (isDefeated) {
                    cnt += aryA[i+1];
                } else {
                    cnt += aryA[i] + aryA[i+1];
                }
                isDefeated = true;
            } else {
                isDefeated = false;
                cnt += aryB[i];
            }
        }
        System.out.println(cnt);
    }
}