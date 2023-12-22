import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input
            int N = Integer.parseInt(sc.next());

            // Solve
            int count = 0;
            for (int a = 1; a < N; a++) {
                for (int b = 1; b < N; b++) {
                    if (a * b >= N) {
                        break;
                    }
                    count++;
                }
            }

            System.out.println(count);
        }
    }

}