import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        long w = std.nextLong();
        long h = std.nextLong();
        long x = std.nextLong();
        long y = std.nextLong();
        double weightX = Math.abs(w * 0.5 - x);
        double weightY = Math.abs(h * 0.5 - y);
        int multi = (weightX == weightY) ? 1 : 0;
        double square;
        if (weightX < weightY) {
            square = (w - x) * h;
        } else {
            square = (h - y) * w;
        }

        System.out.println(String.format("%f %d", square, multi));
    }
}
