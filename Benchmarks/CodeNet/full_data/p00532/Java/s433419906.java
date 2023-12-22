import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] targets = new int[m];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }
        int[] points = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int bonus = 0;
            for (int j = 1; j <= n; j++) {
                int x = sc.nextInt();
                if (x == targets[i]) {
                    points[j]++;
                } else {
                    bonus++;
                }
            }
            points[targets[i]] += bonus;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(points[i]).append("\n");
        }
        System.out.print(sb);
    }
}
