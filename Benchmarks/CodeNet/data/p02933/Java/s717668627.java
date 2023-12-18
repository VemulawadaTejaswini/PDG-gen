import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int a = std.nextInt();
        String s = std.next();
        if (a >= 3200) {
            System.out.println(s);
        } else {
            System.out.println("red");
        }
    }
}
