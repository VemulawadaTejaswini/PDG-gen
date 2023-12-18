import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long min = 1000000;

        for (long i=a; i<=b; i++) {
            long times = a * b;
            if (times % 2019 == 0) {
                min = 0;
                return;
            }

            if (min > times % 2019) {
                min = times % 2019;
            }
        }

        System.out.println(min);
    }
}
