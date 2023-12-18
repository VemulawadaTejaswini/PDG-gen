import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long m = scan.nextLong();
        if (n > m) {
            long tmp = n;
            n = m;
            m = tmp;
        }
        if (n == 1) {
            if (m < 3)
                System.out.println(1);
            else
                System.out.println(m - 2);
        } else if (n == 2) {
            System.out.println(0);
        } else {
            System.out.println((n - 2) * (m - 2));
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
