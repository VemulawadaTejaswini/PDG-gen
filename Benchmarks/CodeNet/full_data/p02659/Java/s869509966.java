import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long max = 1_000_000_000_000_000_000L;
        long root = 3037000499L;
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        double A = in.nextDouble();
        double B = in.nextDouble();
        double ans = A * B;

        System.out.println((long)ans);
        in.close();
    }
}