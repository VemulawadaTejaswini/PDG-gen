import java.util.*;
import java.util.stream.Stream;

public class Main {
    static char[][] ret = new char[100][100];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int a = scan.nextInt();
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 100; j++) {
                ret[2 * i][j] = '.';
            }
            for (int j = 0; j < 100; j++) {
                ret[2 * i + 1][j] = '#';
            }
        }
        for (int i = 0; i < 50 - a; i++) {
            ret[i * 2][0] = '#';
        }
        for (int i = 0; i < 50 - b; i++) {
            ret[i * 2 + 1][99] = '.';
        }
        if (b < 50 && a >= 50) {
            int r = (a - 50) / 40;
            int l = (a - 50) % 40;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < 40; j++) {
                    ret[4 * i + 3][2 + j * 2] = '.';
                }
            }
            for (int i = 0; i < l; i++) {
                ret[4 * r + 3][2 + i * 2] = '.';
            }
        } else if (a < 50 && b >= 50) {
            int r = (b - 50) / 40;
            int l = (b - 50) % 40;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < 40; j++) {
                    ret[4 * i + 4][2 + j * 2] = '#';
                }
            }
            for (int i = 0; i < l; i++) {
                ret[4 * r + 4][2 + i * 2] = '#';
            }
        } else if (a >= 50 & b >= 50) {
            {
                int r = (a - 50) / 40;
                int l = (a - 50) % 40;
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j <= 40; j++) {
                        ret[4 * i + 3][2 + j * 2] = '.';
                    }
                    ret[4 * i + 2][1] = '#';
                }
                if (l != 0) {
                    for (int i = 0; i <= l; i++) {
                        ret[4 * r + 3][2 + i * 2] = '.';
                    }
                    ret[4 * r + 2][1] = '#';
                }
            }
            {
                int r = (b - 50) / 40;
                int l = (b - 50) % 40;
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j <= 40; j++) {
                        ret[4 * i + 52][2 + j * 2] = '#';
                    }
                    ret[4 * i + 51][1] = '.';
                }
                if (l != 0) {
                    for (int i = 0; i <= l; i++) {
                        ret[4 * r + 52][2 + i * 2] = '#';
                    }
                    ret[4 * r + 51][1] = '.';
                }

            }
        }


        System.out.println("100 100");
        for (int i = 0; i < 100; i++) {
            System.out.println(new String(ret[i]));
        }
    }

}