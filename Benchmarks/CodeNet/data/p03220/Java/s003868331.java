import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        int[] h = new int[N];
        for (int i = 0; i < h.length; i++) {
            h[i] = sc.nextInt();
        }
        sc.close();

        int ht;               // 対象地の気温
        int abs = 0;          // 対象地の目標気温差
        int bestAbs = 1000;   // 候補地の目標気温差
        int hn  = 0;          // 候補地の番号

        // 目標気温差が最小の候補地を選定
        for (int i = 0; i < h.length; i++) {

            ht = T - (h[i] * 6 / 1000);
            abs = Math.abs(A-ht);

            if(bestAbs > abs) {
                hn = i;
                bestAbs = abs;
            };
        }
        System.out.println(hn + 1);
    }
}