import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, q, m, d;

        while (true) {
            int maxDay = 0;
            int[] dayCounts = new int[100];
            n = Integer.parseInt(sc.next());
            q = Integer.parseInt(sc.next());
            if (n == 0 && q == 0)
                break;

            for (int i = 0; i < n; i++) {
                m = Integer.parseInt(sc.next());
                for (int j = 0; j < m; j++) {
                    d = Integer.parseInt(sc.next());
                    dayCounts[d]++;
                }
            }

            for (int i = 0; i < dayCounts.length; i++) {
                if (dayCounts[i] > dayCounts[maxDay])
                    maxDay = i;
            }

            if (dayCounts[maxDay] < q)
                maxDay = 0;

            System.out.println(maxDay);
            System.gc();
        }
    }
}