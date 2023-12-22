import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int H = sc.nextInt(), W = sc.nextInt();
                if (H == 0 && W == 0) {
                    break;
                }
                for (int i = 0; i < H; i++) {
                    for (int j = 0; j < W; j++) {
                        if (i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
        }
    }

}


