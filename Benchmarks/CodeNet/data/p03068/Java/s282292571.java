import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        String S;
        int K;
        N = scanner.nextInt();
        S = scanner.next();
        K = scanner.nextInt();

        char c = S.charAt(K-1);
        System.out.println(S.replaceAll("[^" + c + "]", "*"));
    }
}