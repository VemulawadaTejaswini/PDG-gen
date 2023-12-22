import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str[] = new Scanner(System.in).nextLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        System.out.printf("%d %d", (a * b), (a * 2 + b * 2));
    }
}