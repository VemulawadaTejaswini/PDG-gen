import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int H = in.nextInt();
        int W = in.nextInt();

        while (H != 0 && W != 0) {
            for (int i = 0; i < H; i++) {
                if (i == 0 || i + 1 == H) {
                    for (int j = 0; j < W; j++) {
                        System.out.print("#");
                    }
                } else {
                    System.out.print("#");
                    for (int j = 0; j < W - 2; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();

            H = in.nextInt();
            W = in.nextInt();
        }
        System.exit(0);
    }
}

