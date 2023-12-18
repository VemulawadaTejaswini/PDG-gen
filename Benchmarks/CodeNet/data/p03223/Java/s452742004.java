import java.util.*;
import java.awt.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int front = a[0];
        int back = a[0];
        int count = 1;
        int go = -1;
        int point = 0;
        long ans = 0;

        while (count < n) {
            int tmp = a[point];
            if (go == -1) {
                tmp = a[n-1-point];
            }

            if (Math.abs(tmp - front) > Math.abs(tmp - back)) {
                ans += (long)Math.abs(tmp - front);
                front = tmp;
            } else if (Math.abs(tmp - front) < Math.abs(tmp - back)) {
                ans += (long)Math.abs(tmp - back);
                back = tmp;
            } else {
                if (front == back) {
                    ans += (long)Math.abs(tmp - front);
                    front = tmp;
                } else if (go == 1) {
                    if (front < back) {
                        ans += (long)Math.abs(tmp - back);
                        back = tmp;
                    } else {
                        ans += (long)Math.abs(tmp - front);
                        front = tmp;
                    }
                } else {
                    if (front > back) {
                        ans += (long)Math.abs(tmp - back);
                        back = tmp;
                    } else {
                        ans += (long)Math.abs(tmp - front);
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
