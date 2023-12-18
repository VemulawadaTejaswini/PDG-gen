import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();

        a = (a % x == 0) ? a / x : a / x + 1;
        b /= x;

        System.out.println(b - a + 1);

    }

}

