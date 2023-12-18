import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        long n = sc.nextLong();

        long ans = 0;

        for (int i=1; i<=n; i++) {
            if (i%3!=0 && i%5!=0) ans += i;
        }

        System.out.println(ans);


    }
}
