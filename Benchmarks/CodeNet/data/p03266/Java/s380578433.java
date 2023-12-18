import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long cnt = 0;
        long cnt2 = 0;
        long ans = 0;
        if(K%2==0) {
            for(int i = 1; i<=N; i++) {
                if(i%K==0) cnt++;
                if(i%K==K/2) cnt2++;
            }
            ans = cnt*cnt*cnt + cnt2*cnt2*cnt2;
        }else {
            for(int i = 1; i<=N; i++) {
                if(i%K==0) cnt++;
            }
            ans = cnt*cnt*cnt;
        }
        System.out.println(ans);

    }
}