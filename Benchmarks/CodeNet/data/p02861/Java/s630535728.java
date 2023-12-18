import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] xy = new int[n][2];
        for (int i = 0; i < n; i++) {
            xy[i][0] = sc.nextInt();
            xy[i][1] = sc.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += Math.sqrt(Math.pow(xy[i][0] - xy[j][0], 2)
                        + Math.pow(xy[i][1] - xy[j][1], 2));
            }
        }
        System.out.println(2 * sum / n);
    }

}
