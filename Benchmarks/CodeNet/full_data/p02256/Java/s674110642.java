import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strX = scan.next();
        String strY = scan.next();

        int x = Integer.parseInt(strX);
        int y = Integer.parseInt(strY);

        int answer = divisor(x, y);

        System.out.println(answer);
        scan.close();
    }

    static int divisor(int x, int y) {
        if (y > x) {
            return divisor(y, x);
        }
        while (y != 0) {
            int remainder = x % y;
            x = y;
            y = remainder;
        }
        return x;
    }
}
