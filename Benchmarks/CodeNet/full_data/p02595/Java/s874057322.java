import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        long d = sc.nextLong();

        int cnt = 0;
        for (int i=0; i<n; i++) {
            long s = sc.nextLong();
            long t = sc.nextLong();
            long tmp = s*s + t*t;
            if (tmp <= d*d) cnt++;
        }

        System.out.print(cnt);
    }

}

