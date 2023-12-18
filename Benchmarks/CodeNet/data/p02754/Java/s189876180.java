import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long A = sc.nextInt();
        long B = sc.nextInt();

        if (N == 0 || A == 0) {
            System.out.print(0);
        }

        long ans = A;
        if (N > A + B) {
            long diff = N - (A + B);
            ans += diff;
        }
        System.out.println(ans);
    }
}
