import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] s = new int[M];
        int[] c = new int[M];
        int[] num = new int[N];
        int MAX_NUM = 10;
        for(int i = 0; i < N; i++) {
            num[i] = MAX_NUM;
            if (i == 0 && N != 1) {
                num[i]++;
            }
        }
        for(int i = 0; i < M; i++) {
            s[i] = sc.nextInt();
            c[i] = sc.nextInt();
            if (N != 1 && s[i] == 1 && c[i] == 0) {
                System.out.println(-1);
                sc.close();
                return;
            }
            if (num[s[i]-1] >= MAX_NUM) {
                num[s[i]-1] = c[i];
            } else {
                if (num[s[i]-1] != c[i]) {
                    System.out.println(-1);
                    sc.close();
                    return;
                }
            }
        }
        sc.close();

        int ans = 0;
        for(int i = 0; i < N; i++) {
            ans += (num[i] % 10) * (int)Math.pow(10, N - i - 1);
        }
        System.out.println(ans);
    }
}
