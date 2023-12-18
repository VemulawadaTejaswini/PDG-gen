import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        // 後ろから順にボールが入っているかをXORで計算していく
        int[] ball = new int[n + 1];
        for (int i = n; i >= 1; i--) {
            int sum = 0;
            System.err.printf("\n%s \n", i);
            for (int j = i + i; j <= n; j += i) {
                // i倍数の部分だけ計算しなおす
                sum ^= ball[j];
                System.err.printf(" (%s)->%s\n", j, sum);
            }
            // iとXORする
            ball[i] = sum ^ a[i];
            echo(ball);
        }

        int ballCount = (int) Arrays.stream(ball).filter(s -> s != 0).count();
        if (ballCount == 0) {
            System.out.println(0);
        } else {
            // 先にボールの個数を出力して、それ以外はボールが入っている場所だけ出力
            System.out.println(ballCount);
            for (int i = 1; i <= n; i++) {
                if (ball[i] == 0) {
                    continue;
                }
                System.out.println(ball[i]);
            }
        }
    }

    private static void echo(int[] b) {
        System.err.print("[");
        for (int i = 0; i < b.length; i++) {
            System.err.printf("%s ", b[i]);
        }
        System.err.println("]");
    }
}

