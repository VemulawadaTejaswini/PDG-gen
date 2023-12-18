import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long h = scan.nextLong();
        long w = scan.nextLong();

        if (w == 1 || h == 1) {
            System.out.println(1);
            return;
        }

        if (w % 2 == 0) {
            System.out.println((w / 2) * h);
        } else {
            if (h % 2 == 0) {
                System.out.println(w * (h / 2));
            } else {
                System.out.println((w * h + 1) / 2);
            }
        }
    }
}
