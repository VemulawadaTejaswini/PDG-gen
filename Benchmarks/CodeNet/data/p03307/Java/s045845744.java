import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            if (N % 2 == 0) {
                System.out.println(N);
            } else {
                System.out.println(2 * N);
            }
        }
    }
}
