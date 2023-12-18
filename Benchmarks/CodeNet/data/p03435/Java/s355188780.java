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

        for (int a1 = 0; a1 <= 100; a1++) {
            for (int a2 = 0; a2 <= 100; a2++) {
                for (int a3 = 0; a3 <= 100; a3++) {
                    for (int b1 = 0; b1 <= 100; b1++) {
                        for (int b2 = 0; b2 <= 100; b2++) {
                            for (int b3 = 0; b3 <= 100; b3++) {
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