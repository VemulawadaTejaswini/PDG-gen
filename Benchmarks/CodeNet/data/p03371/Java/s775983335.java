import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int A = std.nextInt();
        int B = std.nextInt();
        int C = std.nextInt();
        int X = std.nextInt();
        int Y = std.nextInt();
        
        int halfCost = C * 2;
        if (halfCost > A + B) {
            long sum = A * X + B * Y;
            System.out.println(sum);
            return;
        }

        long sum = 0;
        if (X < Y) {
            long mixCost = X * C * 2;
            long mixMaxCost = Y * C * 2;
            int restCount = Y - X;
            int restCost = restCount * B;
            sum = Math.min(mixCost + restCost, mixMaxCost);
        } else if (Y < X) {
            long mixCost = Y * C * 2;
            long mixMaxCost = X * C * 2;
            int restCount = X - Y;
            int restCost = restCount * A;
            sum = Math.min(mixCost + restCost, mixMaxCost);
        }

        System.out.println(sum);
    }
}
