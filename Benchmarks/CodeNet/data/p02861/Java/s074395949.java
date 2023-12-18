import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        double res = 0;
        long count = 0;

        for (int i = 0; i < n; i++) {
            points[i] = new int[]{sc.nextInt(), sc.nextInt()};
        }

        for (int i = 0; i < n; i++) {
            double local = Math.pow(points[i][0] - points[i][1], 2);
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                double innerLocal = Math.pow(points[j][0] - points[j][1], 2);
                res += Math.sqrt(local + innerLocal);
                for (int k = 0; k < n; k++) {
                    if (i != k && j != k) {
                        double v = Math.pow(points[k][0] - points[k][1], 2);
                        res += Math.sqrt(innerLocal+v);
                        innerLocal = v;
                    }
                }
                count++;
            }
        }
        System.out.println(res / count);
    }
}