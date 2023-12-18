import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int A = std.nextInt();
        int B = std.nextInt();
        int C = std.nextInt();

        int count = Math.min(B / A, C);
        System.out.println(count);
    }
}