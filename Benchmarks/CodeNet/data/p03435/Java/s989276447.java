import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] c = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = sc.nextInt();
            }
        }

        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                if (k == 0) {
                    max1 = Math.max(max1, c[k][l]);
                } else if (k == 1) {
                    max2 = Math.max(max2, c[k][l]);
                } else {
                    max3 = Math.max(max3, c[k][l]);
                }
            }
        }

        for (int a1 = 0; a1 <= max1; a1++) {
            for (int a2 = 0; a2 <= max2; a2++) {
                for (int a3 = 0; a3 <= max3; a3++) {
                    for (int b1 = 0; b1 <= max1; b1++) {
                        for (int b2 = 0; b2 <= max2; b2++) {
                            for (int b3 = 0; b3 <= max3; b3++) {
                                if (c[0][0] == a1+b1 && c[0][1] == a1+b2 && c[0][2] == a1+b3 && c[1][0] == a2+b1 && c[1][1] == a2+b2 && c[1][2] == a2+b3 && c[2][0] == a3+b1 && c[2][1] == a3+b2 && c[2][2] == a3+b3) {
                                    System.out.println("Yes");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("No");
    }
}