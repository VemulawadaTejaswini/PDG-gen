import java.util.*;

public class Main {

    private static int gcd(int a, int b) {
        int gcd;
        while ((gcd = a % b) != 0) {
            a = b;
            b = gcd;
        }
        return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int n = 0; n < N; n += 1) {
            A[n] = Integer.parseInt(sc.next());
        }

        int current = A[0];
        for (int n = 1; n < N; n += 1) {
            current = gcd(current, A[n]);
            if (current == 1) {
                break;
            }
        }
        System.out.println(current);
    }
}
