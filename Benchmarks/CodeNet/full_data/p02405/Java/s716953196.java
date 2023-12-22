import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            if (w == 0 && h == 0) {
                break;
            }
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    if ((x + y) % 2 == 0) {
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

