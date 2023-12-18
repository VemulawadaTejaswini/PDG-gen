import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] c = new char[H+ 2][W + 2];
        for (int i = 0; i < H; i++) {
            String s = sc.next();
            for (int j = 0; j < W; j++) {
                c[i + 1][j + 1] = s.charAt(j);
            }
        }
        for (int i = 1 ; i <= H ; i++) {
            for (int j = 1 ; j <= W ; j++) {
                int count = 0;
                if (c[i][j] == '.') {
                    count += countBomb(i - 1, j - 1, c);
                    count += countBomb(i - 1 , j, c);
                    count += countBomb(i - 1, j + 1, c);
                    count += countBomb(i , j - 1 , c);
                    count += countBomb(i, j + 1, c);
                    count += countBomb(i + 1, j - 1, c);
                    count += countBomb(i + 1, j, c);
                    count += countBomb(i + 1, j + 1, c);
                    c[i][j] =  (char)('0' + count);
                }
                System.out.print(c[i][j]);
            }
            System.out.println("");
        }
    }

    static int countBomb (int i , int j, char [][] c ) {
        if (c[i][j] == '#') {
            return 1;
        } else {
            return 0;
        }
    }

}