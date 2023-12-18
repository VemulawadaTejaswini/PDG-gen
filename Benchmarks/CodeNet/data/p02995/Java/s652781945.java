import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        long a = std.nextLong();
        long b = std.nextLong();
        long c = std.nextLong();
        long d = std.nextLong();
        long aCount = (a - 1) / c + (a - 1) / d - (a - 1) / (c * d);
        long bCount = b / c + b / d - b / (c * d);
        long divCount = bCount - aCount;
        long ans = b - a + 1 - divCount;
        System.out.println(ans);
    }
}
