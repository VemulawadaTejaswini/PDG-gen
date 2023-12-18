import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();

        int num = 0;
        for (int i = 1; i < K + 1; i++) {
            for (int j = 1; j < K + 1; j++) {
                int cache = gcd(i, j);
                for (int k = 1; k < K + 1; k++) {
                    num += gcd(cache, k);
                }
            }
        }
        System.out.println(num);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            a = a % b; // 残り部分
            return gcd(b, a); // 残り部分から最小の正方形を見つける
        }
    }
}