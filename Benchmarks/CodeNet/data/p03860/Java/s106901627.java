
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x[] = new String[3];
        x[0] = input.next();
        x[1] = input.next();
        x[2] = input.next();
        if (x[1].contains("B")) {
            System.out.println("ABC");
            System.out.println("The contest in which you are participating now.");
        } else if (x[1].contains("S")) {
            System.out.println("ASC");
            System.out.println("The contest does not actually exist.");
        } else {
            System.out.println("AXC");
        }

    }
}