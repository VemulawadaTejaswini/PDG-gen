import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int maxOverPerf = 0;
        int minUnderPerf = n + 1;
        for (int i = 0; i < n; i++) {
            int p = cin.nextInt();
            if (p < i + 1) maxOverPerf = Math.max(maxOverPerf, p);
            if (p > i + 1) minUnderPerf = Math.min(minUnderPerf, p);
        }
        System.out.println(Math.min(maxOverPerf, n + 1 - minUnderPerf));
    }
}
