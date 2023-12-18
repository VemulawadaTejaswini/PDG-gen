
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.min(a, b);
        int min = Math.max(0, a + b - n);
        so.println(max + " " + min);
    }
}
