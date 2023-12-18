import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a <= b ? f(a, b) : f(b, a));
        }
    }

    private static String f(int a, int b) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < b; i++) {
            sb.append(a);
        }
        return sb.toString();
    }
}