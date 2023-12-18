import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int w = stdIn.nextInt();
        int h = stdIn.nextInt();
        int x = stdIn.nextInt();
        int y = stdIn.nextInt();

        double ans = w * h / 2;
        System.out.println(ans);
        if (x == w / 2 && y == h / 2)
            System.out.println('1');
        else if (x == w / 2 || y == h / 2)
            System.out.println('0');
        else
            System.out.println('1');
    }
}
