import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();

        long max = 0;

        for (int x=1; x<=n; x++) {
            long f = floor(a, b, x);
            if (f > max) max = f;
        }

        System.out.println(max);
    }

    public static long floor(long a, long b, long x) {
        return (a * x) / b - (x / b);
    }
}
