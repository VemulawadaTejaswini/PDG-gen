import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cost1  = Math.abs(b - a);
        int cost2  = Math.abs(c - a);
        int cost3  = Math.abs(c - b);
        so.println(Math.min(cost1, cost2) + cost3);
    }
}
