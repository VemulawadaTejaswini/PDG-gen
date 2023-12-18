
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long q = sc.nextInt();
        long h = sc.nextInt();
        long s = sc.nextInt();
        long d = sc.nextInt();
        long n = sc.nextInt();

        d = LongStream.of(d, s * 2, h * 4, q * 8).min().getAsLong();
        s = LongStream.of(s, h * 2, q * 4).min().getAsLong();
        System.out.println((n / 2) * d + (n % 2) * s);
    }
}

