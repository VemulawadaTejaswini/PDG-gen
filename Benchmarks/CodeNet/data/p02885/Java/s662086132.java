import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();
            System.out.println(A - 2 * B <= 0 ? 0 : (A - 2 * B));
        }
    }
}
