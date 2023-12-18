import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int cnt = 0;
        if (x < y) {
            if (y < 0) {
                cnt += y - x;
            } else if (x < 0) {
                cnt += 1;
                cnt += y - Math.abs(x);
            } else {
                cnt += y - x;
            }
        } else { // y <= x
            if (x < 0) {
                cnt += 1;
                cnt += Math.abs(y) - Math.abs(x);
                cnt += 1;
            } else if (y < 0) {
                if (Math.abs(y) < Math.abs(x)) {
                    cnt += 1;
                    cnt += x + y;
                } else {
                    cnt += Math.abs(y) - x;
                    cnt += 1;
                }
            }
        }
        out.println(cnt);
    }
}