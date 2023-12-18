
import java.util.Scanner;

public class Main {
    public static void run(int N, int A) {
        int ac = N % 500;

        System.out.println(ac <= A ? "Yes" : "No");
    }

    public static void runInput() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        run(N, A);
    }

    public static void main(String args[]) {
        runInput();
    }
}
