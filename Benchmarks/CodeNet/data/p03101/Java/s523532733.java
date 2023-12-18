import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int h = scanner.nextInt();
        int w = scanner.nextInt();

        int black = 0;
        black = h * W + w * H;
        black -= h * w;
        int white = H * W - black;

        System.out.print(white);
    }
}