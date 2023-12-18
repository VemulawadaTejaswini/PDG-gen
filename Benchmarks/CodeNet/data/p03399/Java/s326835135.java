import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int ans = solve(A, B, C, D);

        System.out.println(ans);
    }

    private static int solve(int A, int B, int C, int D) {
        int sum = 0;

        sum += Math.min(A, B) + Math.min(C, D);

        return  sum;
    }
}
