import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());

        if (n > k && k != 0 && k != 1) {
            long count = 100000000;
            if (n - k * count >= 0) {
                n = Math.abs((long) (n - k * (count - 1)));
            }
            count = 1000000000000l;
            if (n - k * count >= 0) {
                n = Math.abs((long) (n - k * (count - 1)));
            }
            count = 10000000000000000l;
            if (n - k * count >= 0) {
                n = Math.abs((long) (n - k * (count - 1)));
            }
        }


        long tmp = n;

        if (n % k == 0) {
            System.out.println("0");
        } else {
            while (true) {
                long hoge = Math.abs(tmp - k);
                if (hoge <= tmp) {
                    tmp = hoge;
                } else {
                    break;
                }
            }
            System.out.println(tmp);
        }
    }
}
