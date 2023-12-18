
import java.util.Scanner;

class Main {
    public static void main (String[] arg) {
        int N, K;

        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();
        scanner.close();

        int b = K - 1;

        System.out.println(N - b);
    } 
}