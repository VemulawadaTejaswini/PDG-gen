import java.util.Scanner;

/**
 * 数球
 */
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(N/(A+B)*A+Math.min(A, N%(A+B)));
        }
    }
}
