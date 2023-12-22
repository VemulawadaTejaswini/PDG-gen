import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input
            long a = Integer.parseInt(sc.next());
            long b = Integer.parseInt(sc.next());
            long c = Integer.parseInt(sc.next());
            long d = Integer.parseInt(sc.next());

            // Solve
            long result = Math.max(a * c, a * d);
            result = Math.max(result, b * c);
            result = Math.max(result, b * d);
            System.out.println(result);
        }
    }

}