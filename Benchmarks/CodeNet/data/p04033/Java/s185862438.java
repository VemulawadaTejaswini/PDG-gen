import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > 0) {
            so.println("Positive");
            return;
        }
        
        if (b < 0) {
            so.println((b - a) % 2 == 0 ? "Negative" : "Positive");
            return;
        }
        
        so.println("Zero");
    }
}
