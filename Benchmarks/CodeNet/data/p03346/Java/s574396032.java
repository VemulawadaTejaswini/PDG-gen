import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = cin.nextInt();
        }

        int maxOverPerf = 0;
        int maxNum = 0;
        for (int i = 0; i < n; i++) {
            if (p[i] < i + 1 || p[i] < maxNum) {
                maxOverPerf = Math.max(maxOverPerf, p[i]);
            } else {
                maxNum = Math.max(maxNum, p[i]);
            }
        }

        int minUnderPerf = n + 1;
        int minNum = n + 1;
        for (int i = n - 1; i >= 0; i--) {
            if (p[i] > i + 1 || p[i] > minNum) {
                minUnderPerf = Math.min(minUnderPerf, p[i]);
            } else {
                minNum = Math.max(minNum, p[i]);
            }
        }

        System.out.println(Math.min(maxOverPerf, n + 1 - minUnderPerf));
    }
}
