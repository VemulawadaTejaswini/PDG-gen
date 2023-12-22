import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int W = scan.nextInt(), H = scan.nextInt(), x = scan.nextInt(), y = scan.nextInt(), r = scan.nextInt();
        x += r;
        y += r;

        if (W < x || H < y) {
            System.out.println(y);
            System.out.println(x);
            System.out.println("No");
        } else {
            System.out.println(y);
            System.out.println(x);
            System.out.println("Yes");
        }
    }
}