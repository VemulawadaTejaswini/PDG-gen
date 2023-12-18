import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] aList = new int[n];
        long asum = 0;
        for (int i = 0; i < n; i++) {
            aList[i] = sc.nextInt();
            asum += aList[i];
        }

        long bsum = 0;
        long ans = 0;
        long a= 0;
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            aList[i] -= b;
            bsum += b;

            if (aList[i] < 0) {
                ans++;
                a += -(aList[i]);
            }
        }

        if (bsum > asum) {
            System.out.println(-1);
            return;
        }

        Arrays.sort(aList);
        long b = 0;
        for (int i = aList.length - 1; i >= 0; i--) {
            if (b >= a) {
                break;
            }

            b += aList[i];
            ans++;
        }
        System.out.println(ans);
    }
}
