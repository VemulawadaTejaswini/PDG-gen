import java.util.Arrays;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    void run() {
        int N = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int[] T = new int[N];
        for (int i = 0; i < N; i++) T[i] = sc.nextInt();
        Arrays.sort(T);
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int now = T[i];
            int cap = 1;
            int to = i + 1;
            cnt++;
            while (cap < C && to < N && T[to] - now <= K) {
                to++;
                cap++;
            }
            i = to - 1;
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}