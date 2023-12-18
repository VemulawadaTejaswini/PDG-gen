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

        System.out.println(floor(a, b, Math.min(b-1, n)));
    }

    public static long floor(long a, long b, long x) {
        return (a * x / b) - a * (x / b);
    }
}
