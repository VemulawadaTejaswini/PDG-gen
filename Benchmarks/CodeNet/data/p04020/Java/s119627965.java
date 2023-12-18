import java.util.*;

class Main {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int ans = 0;
                int prev = 0;
                for (int i = 0; i < N; i++) {
                        int now = sc.nextInt();
                        ans += Math.min(prev, now);
                        now -= Math.min(prev, now);
                        ans += now / 2;
                        now %= 2;
                        prev = now;
                }
                System.out.println(ans);
        }
}