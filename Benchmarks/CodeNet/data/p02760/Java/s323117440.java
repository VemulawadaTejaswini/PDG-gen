import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);

       int[][][] bingo = new int[3][3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bingo[i][j][0] = sc.nextInt();
                bingo[i][j][1] = 0;
            }
        }

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            lab: for (int k = 0; k < 3; k++) {
                for (int j = 0; j < 3; j++) {
                    if (bingo[k][j][0] == num) {
                        bingo[k][j][1] = 1;
                        break lab;
                    }
                }
            }
        }
        sc.close();

        int yoko = 0, tate;
        for (int i = 0; i < 3; i++) {
            yoko += bingo[i][0][1];
            if (i % 3 == 0) {
                yoko = 0;
            }
            tate = 0;
            for (int j = 0; j < 3; j++) {
                tate += bingo[i][j][1];
            }
            if (tate == 3 || yoko == 3) {
                System.out.println("Yes");
                return;
            }
        }
        int nana1 = bingo[0][0][1] + bingo[1][1][1] + bingo[2][2][1];
        int nana2 = bingo[0][2][1] + bingo[1][1][1] + bingo[2][0][1];
        if (nana1 == 3 || nana2 == 3) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");

    }
}
