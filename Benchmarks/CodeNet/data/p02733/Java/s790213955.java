import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();
        int[][] sunuke = new int[H + 1][W + 1];
        for (int h = 1; h <= H; h++) {
            String line = sc.next();
            char[] hoge = line.toCharArray();

            for (int w = 1; w <= W; w++) {
                sunuke[h][w] = sunuke[h - 1][w]
                        + sunuke[h][w - 1]
                        - sunuke[h - 1][w - 1]
                        + (hoge[w - 1] == '1' ? 1 : 0);
            }
        }
        sc.close();

        int ans = 0;
        for (int h = 1; h <= H; h++) {
            for (int w = 1; w < W; w++) {
                if (sunuke[h][w] > K) {
                        ans += 2;
                    zenbuSageru(sunuke, h, w, sunuke[h - 1][w - 1]);
                }
            }
        }

        System.out.println(ans);
    }

    private static void zenbuSageru(int[][] target, int h_, int w_, int v) {
        for (int h = h_; h < target.length; h++) {
            for (int w = w_; w < target[h].length; w++) {
                target[h][w] -= v;
            }
        }
    }
}
