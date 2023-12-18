import java.util.*;

class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }

    private void run() {
        System.out.println((int)Math.ceil(sc.nextDouble() / 2));
    }
}
