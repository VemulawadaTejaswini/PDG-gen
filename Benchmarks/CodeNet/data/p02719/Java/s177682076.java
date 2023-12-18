import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        long n = sc.nextLong();
        long k = sc.nextLong();

        long tmp = n%k;
        long ans = Math.min(tmp, Math.abs(k-tmp));

        System.out.println(ans);
    }

}
