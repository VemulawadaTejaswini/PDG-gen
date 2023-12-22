import java.math.*;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();

        if (400<=n && n<=599) {
            System.out.print(8);
        } else if (600<=n && n<=799) {
            System.out.print(7);
        } else if (800<=n && n<=999) {
            System.out.print(6);
        } else if (1000<=n && n<=1199) {
            System.out.print(5);
        } else if (1200<=n && n<=1399) {
            System.out.print(4);
        } else if (1400<=n && n<=1599) {
            System.out.print(3);
        } else if (1600<=n && n<=1799) {
            System.out.print(2);
        } else if (1800<=n && n<=1999) {
            System.out.print(1);
        }
    }

}

