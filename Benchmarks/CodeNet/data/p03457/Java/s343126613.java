import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int before_t = 0;
        int t = 0;
        int before_x = 0;
        int x = 0;
        int before_y = 0;
        int y = 0;

        int tmp = 0;
        boolean ans_flg = true;
        for (int i = 0; i < N; i++) {
            t = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            tmp = (y - before_y - before_x + x - before_t + t) % 2;
            if (tmp != 0) {
                ans_flg = false;
                sc.close();
                break;
            }
            before_t = t;
            before_x = x;
            before_y = y;
        }
        sc.close();
        System.out.println(ans_flg ? "Yes" : "No");
    }
}