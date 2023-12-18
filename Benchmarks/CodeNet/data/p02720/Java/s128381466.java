import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long l[] = new long[100002];
        int next = 10;
        int cur = 1;

        l[1] = 1;
        l[2] = 2;
        l[3] = 3;
        l[4] = 4;
        l[5] = 5;
        l[6] = 6;
        l[7] = 7;
        l[8] = 8;
        l[9] = 9;
        for (; next <= k;) {
            long b = l[cur] % 10;

            if (b != 0) {
                l[next] = l[cur] * 10 + b - 1;
                next++;
            }
            l[next] = l[cur] * 10 + b;
            next++;
            if (b != 9) {
                l[next] = l[cur] * 10 + b + 1;
                next++;
            }

            cur++;
        }

        System.out.println(l[k]);
    }
}
