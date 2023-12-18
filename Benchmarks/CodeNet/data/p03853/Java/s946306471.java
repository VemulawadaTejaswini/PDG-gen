
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            char[][] t = new char[H][W];
            for (int i = 0; i < H; i++) {
                t[i] = sc.next().toCharArray();
            }
            for (int i = 0; i < H * 2; i++) {
                for (int j = 0; j < W; j++) {
                    System.out.print(t[i / 2][j]);
                }
                System.out.println();
            }
        }
    }
}
