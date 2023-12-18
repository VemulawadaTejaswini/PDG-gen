import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        List<Long> aryA = new ArrayList<>();
        List<Long> aryB = new ArrayList<>();
        for (int i = 0; i < N+1; i++) {
            long a = Long.parseLong(sc.next());
            aryA.add(a);
        }
        for (int i = 0; i < N; i++) {
            long a = Long.parseLong(sc.next());
            aryB.add(a);
        }
        long cnt = 0L;
        boolean isDefeated = false;
        for (int i = 0; i < N; i++) {
            long enemyCnt = 0L;
            if (isDefeated) {
                enemyCnt = aryA.get(i+1) - aryB.get(i);
            } else {
                enemyCnt = (aryA.get(i) + aryA.get(i+1)) - aryB.get(i);
            }
            if (enemyCnt < 0) {
                if (isDefeated) {
                    cnt += aryA.get(i+1);
                } else {
                    cnt += aryA.get(i) + aryA.get(i+1);
                }
                isDefeated = true;
            } else {
                isDefeated = false;
                cnt += aryB.get(i);
            }
        }
        System.out.println(cnt);
    }
}