import java.util.Scanner;

public class Main {
    private static int N;
    private static int[] A;

    static {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(sc.next());
        }
    }

    public static void main(String[] args) {
        int g = 0;
        for (int i = 0; i < N; i++) {
            g = gcd(g, A[i]);
        }
        System.out.println(g);
    }

    private static int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }
}
