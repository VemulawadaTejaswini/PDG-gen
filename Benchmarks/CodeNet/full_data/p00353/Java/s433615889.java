import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.next());
        int f = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());

        if (m >= b) {
            System.out.println(0);
        } else {
            if (f >= b - m) {
                System.out.println(b - m);
            } else {
                System.out.println("NA");
            }
        }
    }
}

