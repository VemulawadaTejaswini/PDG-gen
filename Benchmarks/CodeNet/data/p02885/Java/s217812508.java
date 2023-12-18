import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int a = std.nextInt();
        int b = std.nextInt();
        int res = Math.max(a - b * 2, 0);
        System.out.println(res);
    }
}