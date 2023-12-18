import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, b);
        max = Math.max(max, c);
        
        boolean ans = false;
        if (max == a) {
            ans = a == b + c;
        } else if (max == b) {
            ans = b == a + c;
        } else {
            ans = c == a + b;
        }

        System.out.println(ans ? "Yes" : "No");
    }
}