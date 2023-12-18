import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        long w = std.nextInt();
        long h = std.nextInt();
        long x = std.nextInt();
        long y = std.nextInt();

        double sq = w * h / 2.0;
        if (w / 2 == x && h / 2 == y) {
            System.out.println(sq + " 1");
        } else {
            System.out.println(sq + " 0");
        }
    }
}
