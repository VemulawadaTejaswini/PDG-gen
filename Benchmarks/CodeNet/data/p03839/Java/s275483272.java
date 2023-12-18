import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];

        long black = 0;
        long white = 0;
        long tmp = 0;
        for (int i=0;i<N;i++) {
            a[i] = sc.nextInt();
            if (i<K) black+=a[i];
            if (i>=K) tmp+=Math.max(0, a[i]);
        }

        long ans = Math.max(black, white);
        for (int i=K;i<N;i++) {
            tmp-=Math.max(0, a[i]);
            tmp+=Math.max(0, a[i-K]);
            black+=a[i];
            black-=a[i-K];
            ans = Math.max(ans, tmp+black);
            ans = Math.max(ans, tmp+white);
        }
        System.out.println(ans);
    }
}