import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scan.nextInt();
        System.out.println(solve(n));
    }
    public static String solve(int n) {
        if (n < 1000) {
            return String.format("ABC%03d", n);
        }
        return String.format("ABD%03d", n - 999);
    }
}
