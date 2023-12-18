import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] C = new int[3][3];
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                C[i][j] = scan.nextInt();
            }
        }

        int min = C[0][0];
        for (int i=1; i<3; i++) {
            if (C[0][i] < min) min = C[0][i];
        }

        int check;
        for (int a1 = 0; a1 <= min; a1++) {
            int c11 = C[0][0] - a1;
            int a2 = C[1][0] - c11;
            int a3 = C[2][0] - c11;

            boolean flag = true;
            for (int i=1; i<3; i++) {
                check = C[0][i] - a1;
                if (C[1][i] - a2 != check || C[2][i] - a3 != check) {
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                System.out.println("Yes");
                System.exit(0);
            }
        }

        System.out.println("No");
    }
}
