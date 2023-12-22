import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
}