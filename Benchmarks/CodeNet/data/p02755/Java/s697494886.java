import java.util.*;

class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }

    private void run() {
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (Math.floor(Math.floor(a / 0.08) * 0.1) == b) {
            System.out.println((int)Math.floor(a / 0.08));
            return;
        }
        if (Math.floor(Math.ceil(a / 0.08) * 0.1) == b) {
            System.out.println((int)Math.ceil(a / 0.08));
            return;
        }
        System.out.println(-1);
    }
}
