import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a * b);
        System.out.println(a + a + b + b);
    }
}