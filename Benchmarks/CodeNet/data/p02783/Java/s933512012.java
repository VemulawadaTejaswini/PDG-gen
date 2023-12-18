import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int h = std.nextInt();
        int a = std.nextInt();
        int count = 0;
        while (h > 0) {
            h = h - a;
            count++;
        }

        System.out.println(count);
    }
}
