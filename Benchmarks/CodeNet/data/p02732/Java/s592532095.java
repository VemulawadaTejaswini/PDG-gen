import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = stdIn.nextInt();
        }
        stdIn.close();
        int[] cnt = new int[N];
        for (int i = 0; i < N; i++) {
            cnt[i] = 0;
            A[i]--;
        }
        for (int i = 0; i < N; i++) {
            cnt[A[i]]++;
        }

        // 消さないとき
        int total = 0;
        for (int i = 0; i < N; i++) {
            total += choose2(cnt[i]);
        }
        // i番目を消したとき
        for (int i = 0; i < N; i++) {
            int ans = total;
            ans -= choose2(cnt[A[i]]);
            ans += choose2(cnt[A[i]] - 1);
            System.out.println(ans);
        }
    }

    // n個の中から2個選ぶ関数
    public static int choose2(int n) {
        return n * (n - 1) / 2;
    }
}