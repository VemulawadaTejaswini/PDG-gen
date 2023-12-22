import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int height = scan.nextInt();
            int width  = scan.nextInt();

            if (height == 0 && width == 0) {
                break;
            }

            for (int i = 0; i < width; i++) {
                System.out.print("#");
            }
            System.out.println();
            for (int i = 1; i < height - 1; i++) {
                System.out.print("#");
                for (int j = 1; j < width - 1; j++) {
                    System.out.print(".");
                }
                System.out.println("#");
            }
            for (int i = 0; i < width; i++) {
                System.out.print("#");
            }
            System.out.println("\n");
        }
    }

}