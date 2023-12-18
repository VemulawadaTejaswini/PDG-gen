import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] x = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                x[i][j] = sc.nextInt();
            }
        }

        int resCnt = 0;
        for (int i = 0; i < n-1; i++) {
            for (int in = i+1; in < n; in++) {
                int sq = 0;
                for (int di = 0; di < d; di++) {
                    sq += Math.pow(x[i][di] - x[in][di], 2);
                }
                if (Math.pow((int)Math.sqrt(sq), 2) == sq) {
                    resCnt++;
                }
            }
        }
        System.out.println(resCnt);
    }
}