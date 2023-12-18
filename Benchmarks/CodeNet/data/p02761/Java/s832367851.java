import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] s = new int[M];
        int[] c = new int[M];
        int[] num = new int[N];
        for(int i = 0; i < N; i++) {
            num[i] = 10;
        }
        for(int i = 0; i < M; i++) {
            s[i] = sc.nextInt();
            c[i] = sc.nextInt();
            if (s[i] == 1 && c[i] == 0) {
                System.out.println(-1);
                return;
            }
            if (num[s[i]-1] == 10) {
                num[s[i]-1] = c[i];
            } else {
                if (num[s[i]-1] != c[i]) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        sc.close();

        if (num[0] == 10) {
            num[0] = 1;
        }
        int ans = 0;
        for(int i = 0; i < N; i++) {
            ans += (num[i] % 10) * (int)Math.pow(10, N - i - 1);
        }
        System.out.println(ans);
    }
}
