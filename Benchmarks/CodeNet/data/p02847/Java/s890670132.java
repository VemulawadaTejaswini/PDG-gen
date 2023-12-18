import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A= Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());
        long X = Long.parseLong(sc.next());

        long left = 0;
        long right = 1000000000;
        long center;

        if (A * 1000000000 + B * String.valueOf(1000000000).length() <= X) {
            System.out.println(1000000000);
            System.exit(0);
        }

        do {
            center = (right + left) / 2;
            if (A * center + B * String.valueOf(center).length() <= X) {
                left = center;
            } else {
                right = center;
            }
        } while (right - left != 1);
        System.out.println(left);
    }
}
