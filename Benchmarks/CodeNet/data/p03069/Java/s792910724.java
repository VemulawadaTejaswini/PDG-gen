

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        try (final Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            String S = sc.next();
            // いったん白黒を数える、かつ境目の数も数える
            int border = 0;
            int b = 0;
            int w = 0;
            char prev = S.charAt(0);
            for (int i = 0; i < N; i++) {
                char c = S.charAt(i);
                b += c == '#' ? 1 : 0;
                w += c == '.' ? 1 : 0;
                if (c != prev) {
                    border += 1;
                }
                prev = c;
            }

            if (border == 1) {
                // 境目が1つ未満の場合は白黒の小さい方の数を返す
                System.out.println(Math.min(b, w));
            } else {
                // 境目ごとに左の黒、右の白の和を求めていく
                int leftB = 0;
                int rightW = w;
                int min = 0;
                prev = S.charAt(0);
                for (int i = 1; i < N; i++) {
                    char c = S.charAt(i);
                    leftB += prev == '#' ? 1 : 0;
                    rightW -= prev == '.' ? 1 : 0;
                    if (c != prev) {
                        int sum = leftB + rightW;
                        min = min == 0 ? sum : Math.min(min, sum);
                    }
                    prev = c;
                }
                System.out.println(min);
            }
        }
    }

}
