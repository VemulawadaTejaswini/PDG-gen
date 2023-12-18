import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();
            if (A == 1) {
                A += 13;
            }
            if (B == 1) {
                B += 13;
            }
            System.out.println(A > B ? "Alice" : A < B ? "Bob" : "Draw");
        }
    }
}
