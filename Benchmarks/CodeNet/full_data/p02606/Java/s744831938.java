import java.math.*;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int l = sc.nextInt();
        int r = sc.nextInt();
        int d = sc.nextInt();

        int cnt = 0;

        for (int i=l; i<=r; i++) {
            if (i % d == 0) cnt++;
        }

        System.out.print(cnt);

    }


}

