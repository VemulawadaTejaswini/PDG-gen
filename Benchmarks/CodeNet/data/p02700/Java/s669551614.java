import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        while (true) {
            c -= b;
            if (c <= 0) {
                System.out.println("Yes");
                return;
            }
            a -= d;
            if (a <= 0) {
                System.out.println("No");
                return;
            }
        }
    }
}
