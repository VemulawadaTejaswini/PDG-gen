import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n ; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        double sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                int xDis = x[i] - x[j];
                int yDis = y[i] - y[j];
                xDis *= xDis;
                yDis *= yDis;
                sum += Math.sqrt(xDis + yDis);
            }
        }

        System.out.println(sum / n);
    }
}