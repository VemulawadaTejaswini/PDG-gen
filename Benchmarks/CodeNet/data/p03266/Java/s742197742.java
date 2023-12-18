import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int count = 0;

        int p1 = 0; // 1つめの組に分類される整数の数
        int p2 = 0; // 2つめの組に分類される整数の数
        if (K % 2 == 0) {
            // Kが偶数のとき
            int Kover2 = K / 2;
            for (int i = 1; i <= N; i++) {
                if (i % K == 0) {
                    p1++;
                }
                if (i % K == Kover2) {
                    p2++;
                }
            }
            count = (int)Math.pow(p1, 3) + (int)Math.pow(p2, 3);
        } else {
            // Kが奇数のとき
            for (int i = 1; i <= N; i++) {
                if (i % K == 0) {
                    p1++;
                }
            }
            count = (int)Math.pow(p1, 3);
        }

        System.out.println(count);
    }
}