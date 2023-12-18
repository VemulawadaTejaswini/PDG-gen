import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x = x2;
        int y = y2;
        int dx = x2 - x1;
        int dy = y2 - y1;
        int tmp = 0;

        for (int i = 0; i < 2; i++) {
            tmp = dx;
            dx = dy;
            dy = tmp;

            dx = dx * -1;
            x += dx;
            y += dy;
            System.out.print(x + " " + y);
            System.out.print(" ");
        }

        sc.close();

    }

}