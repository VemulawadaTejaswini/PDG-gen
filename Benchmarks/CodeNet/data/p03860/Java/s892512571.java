import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String A = in.next();
            String X = in.next();
            String C = in.next();

            System.out.println("A" + X.charAt(0) + "C");
        }
    }
}
