package ABC086A_Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int H, W;
        H = stdIn.nextInt();
        W = stdIn.nextInt();
        String S[][] = new String[H][W];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                S[i][j] = stdIn.next();
            }
        }

        Outer: for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {

                if ((S[i][j]).equals("#")) {
                    //System.out.println("No");
                    if (i == 0 && j == 0) {
                        if ((S[i][j + 1]).equals(".") && (S[i + 1][j]).equals(".")) {
                            System.out.println("No");
                            return;
                        }
                    } else if (i == 0 && j == W - 1) {
                        if ((S[i][j - 1]).equals(".") && (S[i + 1][j]).equals(".")) {
                            System.out.println("No");
                            return;
                        }
                    } else if (i == H - 1 && j == 0) {
                        if ((S[i - 1][j]).equals(".") && S[i][j + 1].equals(".")) {
                            System.out.println("No");
                            return;
                        }
                    } else if (i == H - 1 && j == W - 1) {
                        if (S[i][j - 1].equals(".") && S[i - 1][j].equals(".")) {
                            System.out.println("No");
                            return;
                        }
                    } else if (j == 0) {
                        if (S[i - 1][j].equals(".") && S[i + 1][j].equals(".") && S[i][j + 1].equals(".")) {
                            System.out.println("No");
                            return;
                        }

                    } else if (j == W) {
                        if (S[i - 1][j].equals(".") && S[i + 1][j].equals(".") && S[i][j - 1].equals(".")) {
                            System.out.println("No");
                            return;
                        }
                    } else if (i == 0) {
                        if (S[i][j - 1].equals(".") && S[i][j + 1].equals(".") && S[i + 1][j].equals(".")) {
                            System.out.println("No");
                            return;
                        }

                    } else if (i == H) {
                        if (S[i][j - 1].equals(".") && S[i][j + 1].equals(".") && S[i - 1][j].equals(".")) {
                            System.out.println("No");
                            return;
                        }

                    } else {
                        if (S[i][j - 1].equals(".") && S[i][j + 1].equals(".") && S[i - 1][j].equals(".")
                                && S[i + 1][j].equals(".")) {
                            System.out.println("No");
                            return;
                        }
                    }
                }
            }
        }

        System.out.println("Yes");

    }
}
