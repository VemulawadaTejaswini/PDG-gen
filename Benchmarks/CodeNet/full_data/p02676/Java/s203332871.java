import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        String N = scanner.next();
        if (N.length() <= K) {
            System.out.println(N);
        } else {
            System.out.println(N.substring(0, K) + "...");
        }
    }
}
