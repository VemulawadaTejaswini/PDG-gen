import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (N == 0 || A == 0) {
            System.out.print(0);
        }

        int ans = A;
        if (N > A + B) {
            int diff = N - (A + B);
            ans += diff;
        }
        System.out.print(ans);
    }
}
