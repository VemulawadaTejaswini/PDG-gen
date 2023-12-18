import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int n = N/X-1;
        System.out.println(N + (N/X-1)*2*X + (N-N/X*X) + (X/(N-N/X*X)-1)*2);
    }
}