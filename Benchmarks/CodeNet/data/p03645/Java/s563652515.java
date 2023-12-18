import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ab[][] = new int[2][M];
        boolean ans = false;
        for (int i = 0; M > i; i++) {
            ab[0][i] = sc.nextInt();
            ab[1][i] = sc.nextInt();
        }
        lave:
        for (int j = 0; M > j; j++) {
            if (ab[1][j] == N) {
                for (int k = 0; M > k; k++) {
                    if (ab[1][k] == ab[0][j] && ab[0][k] == 1) {
                        ans = true;
                        break lave;
                    }
                }
            }
        }
        if (ans == true) {
            System.out.println("POSSIBLE");
        } else {
            System.out.println("IMPOSSIBLE");
        }

    }
}
