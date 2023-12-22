import java.util.*;
import static java.lang.Math.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int a = sc.nextInt();
        System.out.println(a + a*a + a*a*a);
    }
}
