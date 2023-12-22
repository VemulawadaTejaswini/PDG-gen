import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][][] dorm = new int[4][3][10];
        for (int i=0; i<n; ++i) {
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();
            dorm[b-1][f-1][r-1] += v;
        }
        for (int i=0; i<3; ++i) {
            print_dorm(dorm, i);
            System.out.println("####################");
        }
        print_dorm(dorm, 3);
        sc.close();
    }

    private static void print_dorm(int[][][] dorm, int wing) {
        for (int i=0; i<3; ++i) {
            for (int j=0; j<10; ++j) {
                System.out.print(" " + dorm[wing][i][j]);
            }
            System.out.println("");
        }
    }
}
