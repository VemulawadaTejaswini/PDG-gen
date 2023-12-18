import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= K; i++) {
            for (int j = 1; j <= K; j++) {
                for (int k = 1; k <= K; k++) {
                    int ij_gcd = gcd(i,j);
                    ans += gcd(ij_gcd,k);
                }
            }
        }
        System.out.println(ans);
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}