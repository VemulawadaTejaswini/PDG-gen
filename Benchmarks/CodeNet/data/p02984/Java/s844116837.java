import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        long[] a = new long[n];
        long sumsum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            sumsum += a[i];
        }
        long yama1 = a[0] + a[a.length-1];
        for (int j = 0; j <= yama1; j+=2) {
            long[] ans = new long[n];
            long sum = 0;
            long tmp = j;
            for (int i = 0; i < n; i++) {
                 ans[i] = tmp;
                 sum += ans[i];
                 tmp = (a[i] - tmp/2)*2;
            }
            if (ans.length == n && sum == sumsum) {
                for (int i = 0; i < n; i++) {
                    if (i != n-1) {
                        System.out.print(ans[i] + " ");
                    } else {
                        System.out.println(ans[i]);
                    }

                }
            }
        }
    }

}
