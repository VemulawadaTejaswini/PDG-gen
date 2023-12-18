import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        String S = sc.next();
        char[] c = S.toCharArray();
        int[] a = new int[N];
        for (int i=0;i<N;i++) {
            a[i] = (int)c[i]-'0';
        }

        if (P==2 || P==5) {
            long ans = 0L;
            for (int i=0;i<N;i++) {
                if (a[i]%P==0) {
                    ans+=(i+1);
                }
            }
            System.out.println(ans);
            return;
        }

        int[] cnt = new int[P];
        int tmp = 0;
        int num = 1;
        long ans = 0;
        for (int i=N-1;i>=0;i--) {
            tmp=(tmp+num*a[i])%P;
            ans+=cnt[tmp];
            cnt[tmp]++;
            if (tmp==0) ans++;
            num=num*10%P;
        }
        System.out.println(ans);
    }
}