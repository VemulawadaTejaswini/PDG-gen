import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println( solve(A, B) );
    }

    private static int solve(int A, int B) {
        int sum = A + B;
        int minus = A - B;
        int mul = A * B;

        return Math.max(Math.max(sum, minus),mul);
    }
}