
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int c = scanner.nextInt();
        String s = scanner.next();
        int[] dpLeftToRight = new int[n];
        dpLeftToRight[0] = s.charAt(0) == 'x' ? 0 : 1;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == 'x') {
                dpLeftToRight[i] = dpLeftToRight[i - 1];
            } else {
                if (i - c - 1 >= 0) {
                    dpLeftToRight[i] = Math.max(dpLeftToRight[i - 1], dpLeftToRight[i - c - 1] + 1);
                } else {
                    dpLeftToRight[i] = Math.max(dpLeftToRight[i - 1], 1);
                }
            }
        }
        if (dpLeftToRight[n - 1] > k || dpLeftToRight[n - 1] < k) {
            return;
        }
        int[] workDaysLeftToRight = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == 'x') {
                continue;
            }
            int workDays = dpLeftToRight[i];
            workDaysLeftToRight[workDays]++;
        }
        int[] dpRightToLeft = new int[n];
        dpRightToLeft[n - 1] = s.charAt(n - 1) == 'x' ? 0 : 1;
        for (int i = s.length() - 2; i >= 0; --i) {
            if (s.charAt(i) == 'x') {
                dpRightToLeft[i] = dpRightToLeft[i + 1];
            } else {
                if (i + c + 1 < n) {
                    dpRightToLeft[i] = Math.max(dpRightToLeft[i + 1], dpRightToLeft[i + c + 1] + 1);
                } else {
                    dpRightToLeft[i] = Math.max(dpRightToLeft[i + 1], 1);
                }
            }
        }
        int[] workDaysRightToLeft = new int[n + 1];
        for (int i = 1; i < n; ++i) {
            if (s.charAt(i) == 'x') {
                continue;
            }
            int workDays = dpRightToLeft[i];
            workDaysRightToLeft[workDays]++;
        }

        int[] ans = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == 'x') {
                continue;
            }
            if (workDaysLeftToRight[dpLeftToRight[i]] == 1) {
                ans[i + 1] = 1;
            }
            if (workDaysRightToLeft[dpRightToLeft[i]] == 1 && dpRightToLeft[i] == k) {
                ans[i + 1] = 1;
            }
        }
        for (int i = 1; i <= n; ++i) {
            if (ans[i] == 1) {
                System.out.println(i);
            }
        }
    }
}

