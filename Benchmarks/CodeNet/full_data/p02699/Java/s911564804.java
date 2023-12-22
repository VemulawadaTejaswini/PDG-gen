import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n <= m) {
            System.out.println("unsafe\n");
        } else {
            System.out.println("safe\n");
        }
    }
}
