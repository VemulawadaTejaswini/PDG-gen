import java.util.*;
import java.awt.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Arrays.sort(a);

        long front = a[0];
        long back = a[0];
        int count = 1;
        int go = -1;
        int point = 0;
        long ans = 0;

        while (count < n) {
            long tmp = a[point];
            if (go == -1) {
                tmp = a[n-1-point];
            }

            if (Math.abs(tmp - front) > Math.abs(tmp - back)) {
                ans += Math.abs(tmp - front);
                front = tmp;
            } else if (Math.abs(tmp - front) < Math.abs(tmp - back)) {
                ans += Math.abs(tmp - back);
                back = tmp;
            } else {
                if (front == back) {
                    ans += Math.abs(tmp - front);
                    front = tmp;
                } else if (go == 1) {
                    if (front < back) {
                        ans += Math.abs(tmp - back);
                        back = tmp;
                    } else {
                        ans += Math.abs(tmp - front);
                        front = tmp;
                    }
                } else {
                    if (front > back) {
                        ans += Math.abs(tmp - back);
                        back = tmp;
                    } else {
                        ans += Math.abs(tmp - front);
                        front = tmp;
                    }
                }
            }

            if (go == -1) point++;
            go *= -1;
            count++;
        }

        System.out.println(ans);
    }
}
