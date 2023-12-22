import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fz[] = new int[N+1];
        for (int i = 1; i <=N; i++) {
            fz[i] = f(i);
        }

        long ans = 0;
        for (int i = 1; i <=N; i++) {
            ans += i*fz[i];
        }
        System.out.println(ans);
    }

    public static int f (int n){
        int cnt = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0) cnt++;
        }
        return cnt;
    }
}