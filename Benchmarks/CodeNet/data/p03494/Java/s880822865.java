import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer A[] = new Integer[N];
        for (int i = 0; i < N; ++i) {
            A[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for (int a : A) {
            int cnt = 0;
            while (a % 2 == 0) {
                ++cnt;
                a /= 2;
            }
            ans = Integer.min(ans, cnt);
        }
        System.out.println(ans);
    }
}