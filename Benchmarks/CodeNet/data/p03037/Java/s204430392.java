import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] in = sc.nextLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);

        // いもす法で解いてみる
        int[] imos = new int[N + 1];
        for (int i = 0; i < M; i++) {
            int start = Integer.parseInt(sc.next());
            int end = Integer.parseInt(sc.next());
            imos[start - 1]++;
            imos[end]--;
        }

        // 累積和
        for (int i = 0; i < N; i++) {
            imos[i + 1] += imos[i];
        }

        // 答え
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (imos[i] == M) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
