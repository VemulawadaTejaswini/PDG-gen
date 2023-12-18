import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] c1 = new int[3][3];
        int[][] c2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c1[i][j] = in.nextInt();
                c2[i][j] = c1[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            c1[i][2] -= c1[i][0];
            c1[i][1] -= c1[i][0];
            c1[i][0] -= c1[i][0];
        }

        for (int j = 0; j < 3; j++) {
            if (!(c1[0][j] == c1[1][j] && c1[1][j] == c1[2][j])) {
                System.out.println("No");
                return;
            }
        }

        for (int i = 0; i < 3; i++) {
            c2[2][i] -= c2[0][i];
            c2[1][i] -= c2[0][i];
            c2[0][i] -= c2[0][i];
        }

        for (int j = 0; j < 3; j++) {
            if (!(c2[j][0] == c2[j][1] && c2[j][1] == c2[j][2])) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}