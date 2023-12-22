
import java.util.Scanner;

public class Main {

    // A ... h1 x w1
    // B ... h2 x w2
    // A < Bならば 1、それ以外ならば0をreturnする
    static int lessThan(int high, int wide, int h, int w) {
        if ((high * high) + (wide * wide) < (h * h) + (w * w) || (high * high) + (wide * wide) == (h * h) + (w * w) && high < h) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int high = scanner.nextInt();
        int wide = scanner.nextInt();
        int a = 0;

        int ah = 149;
        int aw = 150;
        while (high != 0 || wide != 0) {
            for (int h = 1; h < 150; h++) {
                for (int w = h + 1; w < 150; w++) {
                    if (1 == lessThan(high, wide, h, w)) {
                        if (1 == lessThan(h, w, ah, aw)) {
                            ah = h;
                            aw = w;
                        }
                    }
                }
            }
            System.out.println(ah + " " + aw);

            high = scanner.nextInt();
            wide = scanner.nextInt();
            a = 0;

            ah = 149;
            aw = 150;
        }
    }
}



