import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long res = 1L;
        for (int i = 0; i < n; i++) {
            long a = in.nextLong();
            res = res * a;
        }
        if (res > 1000000000000000000L) {
            System.out.println("-1");
        } else {
            System.out.println(res);
        }
    }
}