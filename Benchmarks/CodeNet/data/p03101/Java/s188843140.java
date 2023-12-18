import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int H = sc.nextInt();
        int W = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();

        int black = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (i < h || j < w) {
                    black++;
                }
            }
        }

        System.out.println(H * W - black);
    }
}
