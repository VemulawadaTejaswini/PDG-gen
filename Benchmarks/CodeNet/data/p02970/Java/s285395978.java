import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int D = in.nextInt();
            System.out.println(ceil(N, (2 * D + 1)));
        }
    }

    private static int ceil(int a, int b) {
        return a % b == 0 ? a / b : (a / b + 1);
    }
}
