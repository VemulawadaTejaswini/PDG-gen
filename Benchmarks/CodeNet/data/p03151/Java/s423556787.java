

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextLong();
        }
        for (int i = 0; i < n; ++i) {
            b[i] = scanner.nextLong();
        }
        int lessNum = 0;
        int moreNum = 0;
        long less = 0;
        long more = 0;
        for (int i = 0; i < n; ++i) {
            if (a[i] < b[i]) {
                less += b[i] - a[i];
                ++lessNum;
            }
        }
        if (less == 0) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < n; ++i) {
            if (a[i] > b[i]) {
                more += a[i] - b[i];
                ++moreNum;
            }
        }
        if (more < less) {
            System.out.println(-1);
            return;
        }
        int result = lessNum;

        for (int i = 0; i < n; ++i) {
            if (less <= 0) {
                break;
            }
            if (a[i] > b[i]) {
                less -= a[i] - b[i];
                result++;
            }
        }

        System.out.println(result);


    }
}
