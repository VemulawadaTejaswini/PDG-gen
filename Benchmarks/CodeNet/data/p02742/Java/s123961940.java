import java.util.Scanner;

import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long h = in.nextInt();
        long w = in.nextInt();
        long res = (h * w + 1) / 2;
        if (min(h, w) == 1) {
            res = 1;
        }
        System.out.println(res);
    }
}
