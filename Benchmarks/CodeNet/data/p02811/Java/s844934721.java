import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int K = sc.nextInt();
            int X = sc.nextInt();
            System.out.println(500 * K >= X ? "Yes" : "No");
        }
    }
}