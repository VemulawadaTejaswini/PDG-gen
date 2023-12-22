import java.util.*;

class AOJ0289 {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            int cnt = 0;
            while(d > s) {
                cnt += (s & 1) + (d & 1);
                s += s & 1;
                s >>= 1;
                d >>= 1;
            }
            System.out.println(cnt);
        }
    }
}
public class Main {
    public static void main(String... args) {
        AOJ0289.main();
    }
}