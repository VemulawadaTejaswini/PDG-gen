import java.util.Scanner;

public class Main {

    private static int solve(int N) {
        int s = 0;
        while (N > 0) {
            int m = N % 10;
            if (m == 2) {
                s += 1;
            }
            N /= 10;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(solve(N));
    }
}
