import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] sumh = new int[w];

        int[][] ans = new int[h][w];
        for (int j = 0; j < a; j++) {
            ans[0][j] = 1;
            sumh[j]++;
        }
        for (int i = 1; i < h; i++) {
            int sumw = 0;
            for (int j = 0; j < w; j++) {
                if (sumh[j] < b) {
                    ans[i][j] = 1;
                    sumh[j]++;
                    sumw++;
                }
                if (sumw >= a) {
                    break;
                }
            }
            if (sumw < a) {
                System.out.println("No");
                System.exit(0);
            }
        }

        for (int j = 0; j < w; j++) {
            if (sumh[j] < b) {
                System.out.println("No");
                System.exit(0);
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }

}
