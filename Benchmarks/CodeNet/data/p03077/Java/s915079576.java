import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long min = sc.nextLong();
        for (int i = 0; i < 4; i++) {
            min = Math.min(min, sc.nextLong());
        }

        long ans = 4L + (n / min);
        if(n % min != 0) ans += 1L;
        System.out.println( ans);
        sc.close();
    }

}
