import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int t = (c % b == 0) ? c/b : c/b + 1;
        int s = (a % d == 0) ? a/d : a/d + 1;

        if (t <= s) {
            System.out.println("Yes");
        } else {
            System.out.println("No\n");
        }
    }
}
