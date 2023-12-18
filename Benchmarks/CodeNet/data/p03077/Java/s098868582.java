import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        long time = 0;
        long curTime = 0;
        long prev = Long.MAX_VALUE;
        for (int i = 0; i < 5; i += 1) {
            long cur = sc.nextLong();
            if (cur < prev) {
                if (i != 0) {
                    N -= (curTime - 1) * cur;
                }
                curTime = N / cur;
                curTime += N % cur != 0 ? 1 : 0;
                prev = cur;
            } else {
                curTime = 1;
            }
            time += curTime;
        }

        System.out.println(time);
    }

}
