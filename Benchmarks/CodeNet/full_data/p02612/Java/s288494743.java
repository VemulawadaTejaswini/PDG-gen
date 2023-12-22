import java.math.*;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();

        if (n % 1000 == 0) {
            System.out.print(0);
        } else {
            System.out.print(1000 - n % 1000);
        }
    }


}

