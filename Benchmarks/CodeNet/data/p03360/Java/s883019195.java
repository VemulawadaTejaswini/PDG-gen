import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] ans = new long[3];
        ans[0] = sc.nextLong();
        ans[1] = sc.nextLong();
        ans[2] = sc.nextLong();
        int N = sc.nextInt();

        long max = 0;
        for (int i = 0; i < 2; i++) {
            max = Math.max(ans[i], ans[i + 1]);
        }

        int maxIndex = 0;
        for (int i = 0; i < 3; i++) {
            if (ans[i] == max) {
                maxIndex = i;
            }
        }

        while (N > 0) {
            max = max * 2;
            N--;
        }

        long res = 0;
        for (int i = 0; i < 3; i++) {
            if (maxIndex == i) {
                res += max;
            } else {
                res += ans[i];
            }
        }

        System.out.println(res);
    }
}
