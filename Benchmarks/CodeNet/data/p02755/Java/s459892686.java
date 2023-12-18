import java.util.*;

class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }

    private void run() {
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < 1250; i++) {
            int p = (int) Math.floor(i * 0.08);
            if (p == a && p == b) {
                System.out.println(p);
                return;
            }
        }
        System.out.println(-1);
    }
}
