import java.util.*;

public class Main {

    public static void main(String arg[]) {
        try {
            Scanner scan = new Scanner(System.in);
            int W = scan.nextInt();
            int H = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int r = scan.nextInt();

            if (-101 < x && x < 101 && -101 < y && y < 101 && 0 < W && W < 101 && 0 < H && H < 101 && 0 < r && r < 101) {
                if (0 <= x - r && 0 <= y - r && x + r <= W && y + r <= H) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        } catch (InputMismatchException ex) {
            System.out.println("1??????100?????§????????¶??°?????\?????????????????????");
        }
    }
}