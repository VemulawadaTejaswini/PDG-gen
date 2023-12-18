import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double eps = Math.pow(10, -10);


        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());

        int[][] x = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                x[i][j] =  Integer.parseInt(sc.next());
            }
        }


        double dist = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                dist = 0;

                for (int k = 0; k < d; k++){
                    dist += Math.pow((x[i][k] - x[j][k]), 2);
                }

                dist = Math.sqrt(dist);
                if ((dist - (int)dist) < eps) {
                    count++;
                }
            }
        }

        System.out.println(count/2);
    }
}