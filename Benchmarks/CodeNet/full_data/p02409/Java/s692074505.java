import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bfrv[][][] = new int[5][4][11];
        int b = 0;
        int f = 0;
        int r = 0;
        int v = 0;
        for (int i = 0; i < n; i++) {

            b = sc.nextInt();
            f = sc.nextInt();
            r = sc.nextInt();
            v = sc.nextInt();

            bfrv[b][f][r] += v;
            if (bfrv[b][f][r] < 0) {
                bfrv[b][f][r] = 0;
            }
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 4; j++) {
                for (int k = 1; k < 11; k++) {
                    System.out.print(" ");
                    System.out.print(bfrv[i][j][k]);
                }
                System.out.println("");
            }
            if (i != 4) {
                System.out.println("####################");
            }
        }
    }
}