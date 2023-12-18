import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            System.out.println(isMiserable(A, B, C) || isMiserable(B, C, A) || isMiserable(C, A, B) ? "Yes" : "No");
        }
    }

    private static boolean isMiserable(int a, int b, int c) {
        return a == b && b != c;
    }
}
