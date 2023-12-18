import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int K = sc.nextInt();
            int X = sc.nextInt();

            int min = X - K + 1;
            int max = X + K - 1;

            System.out.println(min);
            for (int i = min + 1; i <= max; i++) {
                System.out.println(" " + i);
            }
        }
    }

}
