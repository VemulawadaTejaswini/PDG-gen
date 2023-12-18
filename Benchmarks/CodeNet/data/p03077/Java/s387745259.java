import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        long time = 0;
        long prev = Long.MAX_VALUE;
        for (int i = 0; i < 5; i += 1) {
            long cur = sc.nextLong();
            if (cur < prev) {
                N -= i != 0 ? (time - 1) * cur : 0;
                time += N / cur;
                time += N % cur != 0 ? 1 : 0;
                prev = cur;
            } else {
                time += 1;
            }
        }

        System.out.println(time);
    }

}
