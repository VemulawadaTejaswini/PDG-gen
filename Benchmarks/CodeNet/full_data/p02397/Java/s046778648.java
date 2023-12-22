import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            int xy = Math.multiplyExact(x, y);
            System.out.println(xy == 1 ? x + " " + y : y + " " + x);
        }

    }
}