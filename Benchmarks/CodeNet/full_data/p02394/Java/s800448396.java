import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();

        if (isOutOfRectangle(x, y, width, height, r)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    public static boolean isOutOfRectangle(int x, int y, int width, int height, int r) {
        if (x - r < 0 || y - r < 0) {
            return true;
        }
        if (x + r > width || y + r > height) {
            return true;
        }

        return false;
    }
}

