import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = sc.nextInt();
        boolean ans = solve(A, B, X);

        System.out.println(ans ? "YES" : "NO");
    }

    private static boolean solve(int A, int B, int X) {
        if (A <= X && X <= A+B) return true;

        return false;
    }
}
