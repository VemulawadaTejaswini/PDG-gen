import java.math.*;
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
        int k = sc.nextInt();

        while (a >= b) {
            b *= 2;
            k--;
        }

        while (b >= c) {
            c *= 2;
            k--;
        }

        if (0<=k) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }

}

