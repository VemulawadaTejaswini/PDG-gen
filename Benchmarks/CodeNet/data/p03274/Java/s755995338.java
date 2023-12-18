import java.util.Scanner;

public class Main107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        if (K == 1) {
            System.out.println(sc.nextInt());
            return;
        }

        int[] candles = new int[N];
        int[] candleCum = new int[N+1];
        for (int i = 0; i < N; i++) {
            candles[i] = sc.nextInt();
            if (i - K + 1 >= 0) {
                if (candles[i] > 0 && candles[i-K+1] < 0) {
                    candleCum[i - K + 1] = candles[i] - candles[i - K + 1] + Math.min(Math.abs(candles[i - K + 1]), candles[i]);
                } else if (candles[i] > 0 && candles[i-K+1] > 0) {
                    candleCum[i - K + 1] = candles[i];
                } else {
                    candleCum[i - K + 1] = candles[i - K + 1];
                }
            }
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < candleCum.length; i++) {
            if (candleCum[i] == 0) {
                continue;
            }
            min = Math.min(candleCum[i], min);
        }

        System.out.println(min);


    }
}
